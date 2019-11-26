package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int n = Integer.parseInt(reader.readLine()); // считываем количество вариантов
        for (int i = 0; i < n; i++) { // цикл, где количество циклов меньше количества вариантов
            int max = Integer.parseInt(reader.readLine());
            if (max > maximum) maximum = max;  // если вводимое число больше предыдущего максимального, оно - новое максимальное
        }


        //напишите тут ваш код

        System.out.println(maximum);
    }
}
