package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) list.add(reader.readLine()); //  заполнили массив
        int minimum = Integer.MAX_VALUE; // минимальная длина массива
        int maximum = 0; // максимальная длина массива
        int minimumNumber = 0; // номер минимальной строки в массиве
        int maximumNumber = 0; // номер максимальной строки в массиве

        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < minimum) { // сравниваем максимумы и минимумы в цикле и заносим соответствующие инт-данные
                if (list.get(i).length() > maximum) {
                    minimum = list.get(i).length();
                    maximum = list.get(i).length();
                    minimumNumber = i;
                    maximumNumber = i;
                } else {
                    minimum = list.get(i).length();
                    minimumNumber = i;
                }
            } else if (list.get(i).length() > maximum) {
                maximum = list.get(i).length();
                maximumNumber = i;
            }
        }

        if (minimumNumber < maximumNumber) System.out.println(list.get(minimumNumber)); // смотрим что встретелось раньше, минимальное или максимальное
        else System.out.println(list.get(maximumNumber));

        //напишите тут ваш код
    }
}
