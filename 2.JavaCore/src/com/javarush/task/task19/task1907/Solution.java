package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        reader.close();
        String alltext = ""; // весь текст в файла в строку
        while (fileReader.ready()) {
            int data = fileReader.read();
            alltext = alltext + (char) data;
        }
        fileReader.close();
        String[] buffer = alltext.split("\\W+"); // разбиваем строку по знакам препинания
        int count = 0;
        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i].equals("world")) count++;
        }
        System.out.print(count);
    }
}
