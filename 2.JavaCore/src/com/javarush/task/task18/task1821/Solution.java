package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        try {
            Map<Integer, Integer> treeMap = new TreeMap<>();

            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            int symbol;

            // считываем символ, если такое значени есть в мэп - увеличиваем значение на единицу, если нет - создаем новое
            while ((symbol = reader.read()) != -1) {
                int asciiChar = (int) ((char) symbol); // преобразуем символ в аскии код (НАВЕРНОЕ!, можно было сразу в чар заносить)
                if (!treeMap.containsKey(asciiChar)) {
                    treeMap.put(asciiChar, 1);
                } else {
                    treeMap.put(asciiChar, (int) treeMap.get(asciiChar) + 1);
                }
            }

            reader.close();

            // выводим значение, при этом преобразую аскии код обратно в символ
            for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                System.out.println(((char)((int) entry.getKey())) + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
