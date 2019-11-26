package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setCountry(User.Country.RUSSIA);
            user.setFirstName("DI");
            user.setLastName("MR");
            user.setMale(true);
            user.setBirthDate(new SimpleDateFormat("dd/M/yyyy").parse("25/05/1997"));
            javaRush.users.add(user);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the codeGym object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            if (javaRush.equals(loadedObject)) System.out.println("YES");
            //System.out.println(javaRush.users.get(0).getFirstName() + javaRush.users.get(0).getLastName() + javaRush.users.get(0).getBirthDate() + javaRush.users.get(0).getCountry() + javaRush.users.get(0).isMale());
            //System.out.println(loadedObject.users.get(0).getFirstName() + loadedObject.users.get(0).getLastName() + loadedObject.users.get(0).getBirthDate() + loadedObject.users.get(0).getCountry() + loadedObject.users.get(0).isMale());

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            if (users.size() != 0) {
                writer.println(users.size());
            } else writer.println("0");

            for (int i = 0; i < users.size(); i++) {
                writer.println(users.get(i).getFirstName() + "---" + users.get(i).getLastName() + "---" +
                users.get(i).getBirthDate().getTime() + "---" + users.get(i).isMale() + "---" + users.get(i).getCountry());
            }

            writer.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            int size = Integer.parseInt(reader.readLine());
            if (size != 0) {
                for (int i = 0; i < size; i++) {
                    String currentLine = reader.readLine();
                    String[] parametres = currentLine.split("---");
                    User user = new User();
                    user.setFirstName(parametres[0]);
                    user.setLastName(parametres[1]);
                    user.setBirthDate(new Date(Long.parseLong(parametres[2])));
                    user.setMale(parametres[3].equals("true") ? true : false);
                    user.setCountry(User.Country.valueOf(parametres[4].toUpperCase()));
                    users.add(user);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
