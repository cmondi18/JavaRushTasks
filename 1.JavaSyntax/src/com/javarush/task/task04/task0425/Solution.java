package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sA = bufferedReader.readLine();
        int a = Integer.parseInt(sA);
        String sB = bufferedReader.readLine();
        int b = Integer.parseInt(sB);

        if (a > 0) {
            if (b > 0) System.out.println("1");
            else System.out.println("4");
        }
        else if (b > 0) System.out.println("2");
        else System.out.println("3");

        //напишите тут ваш код
    }
}
