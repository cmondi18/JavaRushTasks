package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bufferedReader.readLine();
        int a = Integer.parseInt(a1);
        String b1 = bufferedReader.readLine();
        int b = Integer.parseInt(b1);
        String c1 = bufferedReader.readLine();
        int c = Integer.parseInt(c1);

        if (a >= (b + c))
            System.out.println("Треугольник не существует.");
        else if (b >= (a + c))
            System.out.println("Треугольник не существует.");
        else if (c >= (a + b))
            System.out.println("Треугольник не существует.");
        else
            System.out.println("Треугольник существует.");
        //напишите тут ваш код
    }
}