package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Solution.strings = new ArrayList<>(); // иницилизируем массив
        int maximum = 0; // максимальная длина
        int number = 0; // номер максимальной строки в массиве
        for (int i = 0; i < 5; i++) { // заносим строки в массив и сравниваем длину строки с максимальной, если она больше - обновляем максимальную длину строки и номер этой строки в массиве
            String text = reader.readLine();
            Solution.strings.add(text);
            if (Solution.strings.get(i).length() > maximum) {
                maximum = Solution.strings.get(i).length();
                number = i;
            }
        }

        for (int i = 0; i < 5; i++) { // сравниваем остальный строки с максимально длинной для нахождения таких же по длине строк
            if (Solution.strings.get(i).length() == Solution.strings.get(number).length()) System.out.println(Solution.strings.get(i));
        }
        //напишите тут ваш код
    }
}
