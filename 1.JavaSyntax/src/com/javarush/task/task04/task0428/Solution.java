package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int count = 0; // количество положительных оценок

        if (a > 0) count = count + 1;
        if (b > 0) count = count + 1;
        if (c > 0) count = count + 1;

        System.out.println(count);
        //напишите тут ваш код

    }
}
