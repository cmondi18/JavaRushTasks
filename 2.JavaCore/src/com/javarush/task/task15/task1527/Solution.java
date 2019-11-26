package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine(); // считываем URL

        String parametres = url.substring(url.indexOf("?") + 1); // отбрасываем "мусор", оставляя лишь параметры

        String[] parts = parametres.split("&"); // массив параметров с значениями (параметр с значением в одной ячейке)

        Map<String, String> splitParts = new LinkedHashMap<>(); // Мэп для хранения пар параметров и значений

        // проходим по массиву, где разбиваем кажду ячейку на пару (параметр - значение) и вносим в Мэп
        for (String i : parts) {
            String[] timedParts = i.split("=");
            splitParts.put(timedParts[0], timedParts.length > 1 ? timedParts[1] : null);
        }

        // выводим параметры на экран
        for (Map.Entry<String, String> pair : splitParts.entrySet()) {
            System.out.print(pair.getKey() + " ");
        }

        System.out.println(); // отступ

        // проверяем параметры на наличие obj и вызываем метод alert, соответствующий типу значения (double, String)
        for (Map.Entry<String, String> pair : splitParts.entrySet()) {
            if (pair.getKey().equals("obj")) try {
                double dParametr = Double.parseDouble(pair.getValue());
                alert(dParametr);
            } catch (NumberFormatException e) {
                alert(pair.getValue());
            }
        }
        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
