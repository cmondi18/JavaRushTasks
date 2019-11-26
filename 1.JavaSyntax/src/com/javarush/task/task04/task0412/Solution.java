package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        int b = Integer.parseInt(a);
        if (b > 0) {
            b = b * 2;
            System.out.println(b);
        } else if (b < 0) {
            b = b + 1;
            System.out.println(b);
        } else System.out.println(0);

        //напишите тут ваш код

    }

}