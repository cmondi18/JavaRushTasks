package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int[] treshina = new int[20];

        for (int i = 0; i < treshina.length; i++) treshina[i] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < treshina.length; i++) {
            maximum = Math.max(maximum, treshina[i]);
            minimum = Math.min(minimum, treshina[i]);
        }

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
