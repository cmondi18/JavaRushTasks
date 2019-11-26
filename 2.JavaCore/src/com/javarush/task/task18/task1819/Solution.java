package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileInputStream fileOne = new FileInputStream(file);
        FileInputStream fileTwo = new FileInputStream(reader.readLine());
        reader.close();

        byte[] buffer = new byte[fileOne.available()];
        byte[] buffer2 = new byte[fileTwo.available()];

        fileOne.read(buffer);
        fileTwo.read(buffer2);

        fileOne.close();
        fileTwo.close();

        FileOutputStream fileOneOutput = new FileOutputStream(file);
        fileOneOutput.write(buffer2);
        fileOneOutput.write(buffer);

        fileOneOutput.close();
    }
}
