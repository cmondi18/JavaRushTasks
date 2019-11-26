package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = fileNameReader.readLine(); // получаем имя файла
        fileNameReader.close();

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName))); // создаем поток с нашего файла
        ArrayList<Integer> evenNumbers = new ArrayList<>(); // коллекция для хранения четных чисел

        String x;
        // цикл считывания чисел с файла, если число четное - добавляем в коллекцию четных чисел
        while ((x = fileReader.readLine()) != null) {
            int data = Integer.parseInt(x);
            if (data % 2 == 0) evenNumbers.add(data);
        }
        fileReader.close();

        Collections.sort(evenNumbers); // сортируем по возрастанию

        // выводим в консоль
        for (int i : evenNumbers) {
            System.out.println(i);
        }


        // напишите тут ваш код
    }
}
