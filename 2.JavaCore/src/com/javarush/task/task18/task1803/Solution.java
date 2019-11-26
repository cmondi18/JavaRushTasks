package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
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

        // из мэпа считываем количество для нахождения максимального
        int maxValue = 1;
        for (int value : all.values()) {
            if (value > maxValue) maxValue = value;
        }

        // выводим все ключи, где количество = максимальное из мэп
        for (Map.Entry<Integer, Integer> entry : all.entrySet()) {
            if (entry.getValue() == maxValue) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
