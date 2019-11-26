package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String aA = bufferedReader.readLine();
        int a = Integer.parseInt(aA);
        String bB = bufferedReader.readLine();
        int b = Integer.parseInt(bB);

        if (a < b) System.out.println(a);
        else System.out.println(b);
        //напишите тут ваш код
    }
}