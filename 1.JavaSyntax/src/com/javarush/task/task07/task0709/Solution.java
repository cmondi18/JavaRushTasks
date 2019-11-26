package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>(); // иницилизируем массив
        int minimum = Integer.MAX_VALUE; // минимальная длина
        int number = 0; // номер минимальной строки в массиве
        for (int i = 0; i < 5; i++) { // заносим строки в массив и сравниваем длину строки с максимальной, если она больше - обновляем максимальную длину строки и номер этой строки в массиве
            String text = reader.readLine();
            list.add(text);
            if (list.get(i).length() < minimum) {
                minimum = list.get(i).length();
                number = i;
            }
        }

        for (int i = 0; i < 5; i++) { // сравниваем остальный строки с минимальной длинной для нахождения таких же по длине строк
            if (list.get(i).length() == list.get(number).length()) System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}
