package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dataName = reader.readLine(); // считываем название файла

        InputStream inStream = new FileInputStream(dataName); // вносим поток с нашего файла

        // считываем с файла байт информации, при выводи трансформируем в char
        while (inStream.available() > 0) {
            int data = inStream.read();
            System.out.print((char) data);
        }

        reader.close();
        inStream.close();
        // напишите тут ваш код
    }
}