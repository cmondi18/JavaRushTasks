package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());
        reader.close();

        while (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            byte[] file1 = new byte[inputStream.available()];
            byte[] file2 = new byte[inputStream.available()];
            int count = inputStream.read(buffer);

            int halfcount = 0; // половина массива
            int file1count = 0; // длина массива для 1 файла
            int file2count = 0; // длина массива для 2 файла

            // нахождение половины массива для четных и не четных кол-ва байт
            if (count % 2 == 0) halfcount = count / 2;
            else halfcount = (count / 2) + 1;

            // записываем 1 половину в первый файл
            for (int i = 0; i < halfcount; i++) {
                file1[file1count] = buffer[i];
                file1count++;
            }

            // записываем 2 половину во второй файл
            for (int i = halfcount; i < count; i++) {
                file2[file2count] = buffer[i];
                file2count++;
            }

            outputStream1.write(file1, 0, file1count);
            outputStream2.write(file2, 0, file2count);
        }
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}

