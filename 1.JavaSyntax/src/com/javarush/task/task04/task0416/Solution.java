package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sT = bufferedReader.readLine();
        double t = Double.parseDouble(sT);
        double i = 3.0;

        while (i <= 60.0) {
            if (t < i) {
                System.out.println("зеленый");
                break;
            } else {
                i = i + 1;
                if (t < i) {
                    System.out.println("жёлтый");
                    break;
                } else {
                    i = i + 1;
                    if (t < i) {
                        System.out.println("красный");
                        break;
                    } else i = i + 3;
                }
            }
        }
        //напишите тут ваш код

    }
}