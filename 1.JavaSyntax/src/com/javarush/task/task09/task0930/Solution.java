package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> numbers = new ArrayList<>(); // создание коллекции для чисел
        ArrayList<String> strings = new ArrayList<>(); // создание коллекции для строк

        // раскидываем исходный массив по коллекциям чисел и строк
        for (String i : array) {
            if (isNumber(i)) numbers.add(Integer.parseInt(i));
            else strings.add(i);
        }

        int temp; // переменная для временного хранения значений пузырькового метода сортировки

        // сортируем числа методом пузырька
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) < numbers.get(j)) {
                    temp = numbers.get(j);
                    numbers.set(j, numbers.get(i));
                    numbers.set(i, temp);
                }
            }
        }

        String tempString; // переменная для временного хранения значений пузырькового метода сортировки

        // сортируем строки методом isGreaterThan
        for (int i = 0; i < strings.size(); i++) {
            for (int j = i + 1; j < strings.size(); j++) {
                if (isGreaterThan(strings.get(i), strings.get(j))) {
                    tempString = strings.get(i);
                    strings.set(i, strings.get(j));
                    strings.set(j, tempString);
                }
            }
        }

        // записываем в исходный массив отсортированные списки, согласно изначальным позициям (число, строка)
        for (int i = 0, s = 0, n = 0; i < array.length; i++) {
            if (isNumber(array[i])) array[i] = String.valueOf(numbers.get(n++));
            else array[i] = strings.get(s ++);
        }
        // напишите тут ваш код
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
