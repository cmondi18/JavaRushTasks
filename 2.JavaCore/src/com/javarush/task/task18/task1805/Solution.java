package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();

        Set<Integer> set = new LinkedHashSet<>();

        // считываем данные и записываем в сэт (уникальные значения)
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            set.add(data);
        }
        inputStream.close();

        // переносим из сэта в лист и выполняем сортировку
        List sortedList = new ArrayList(set);
        Collections.sort(sortedList);

        // выводим на экран
        for (Object i : sortedList) {
            System.out.print(i + " ");
        }
    }
}
