package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();

        HashMap<Integer, Integer> all = new HashMap<>();

        // считываем данные из файла и записывем в мэп, если такое значение уже было - увеличиваем его количество на 1
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (all.containsKey(data)) {
                all.put(data, all.get(data) + 1);
            } else {
                all.put(data, 1);
            }
        }
        inputStream.close();


        // из мэпа считываем количество для нахождения минимального
        int minValue = Integer.MAX_VALUE;
        for (int value : all.values()) {
            if (value < minValue) minValue = value;
        }
        // выводим все ключи, где количество = минимальное из мэп
        for (Map.Entry<Integer, Integer> entry : all.entrySet()) {
            if (entry.getValue() == minValue) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
