package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line;
        String name = "";
        String stringdate = "";
        Date date = null;
        DateFormat dateFormat = new SimpleDateFormat("yyyy MM dd");

        while ((line = reader.readLine()) != null) {
            String[] buffer = line.split(" ");
            // получаем имя
            for (int i = 0; i < buffer.length - 3; i++) {
                name = name + " " + buffer[i];
            }

            // получаем дату рождения
            for (int i = buffer.length - 1; i >= buffer.length - 3; i--) {
                stringdate = stringdate + " " + buffer[i];
            }

            name = name.substring(1);
            stringdate = stringdate.substring(1);
            date = dateFormat.parse(stringdate);

            PEOPLE.add(new Person(name, date));

            // зануляем переменные, для нового Person
            stringdate = "";
            name = "";
        }
        reader.close();
    }
}
