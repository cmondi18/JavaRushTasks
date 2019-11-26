package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hash = new HashMap<>();

        while (true) {
            int id = 0;
            String stringId = reader.readLine();
            if (stringId.isEmpty()) break; // если id - пустое значение, прерываем цикл
            else id = Integer.parseInt(stringId);

            String name = reader.readLine();
            if (name.isEmpty()) { // если name - пустое значение, выводим id и прерываем цикл
                System.out.println(id);
                break;
            }
            else hash.put(name, id);
        }

        for (Map.Entry<String, Integer> pair : hash.entrySet()){ // выводим hashmap
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
