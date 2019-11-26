package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        // создай и заполни массив
        return list;
    }

    public static int max(int[] array) {
        int maximum = array[1];
        for (int j = 0; j < array.length; j++)
        {
            if (array[j] > maximum) maximum = array[j];
        }
        // найди максимальное значение
        return maximum;
    }
}
