package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sA = bufferedReader.readLine();
        int a = Integer.parseInt(sA);

        int sALenght = sA.length();

        if (a % 2 > 0 && a != 0) {
            if (sALenght == 1) System.out.println("нечетное однозначное число");
            else if (sALenght == 2) System.out.println("нечетное двузначное число");
            else if (sALenght == 3) System.out.println("нечетное трехзначное число");
        } else if (a != 0) {
            if (sALenght == 1) System.out.println("четное однозначное число");
            else if (sALenght == 2) System.out.println("четное двузначное число");
            else if (sALenght == 3) System.out.println("четное трехзначное число");
        }
        //напишите тут ваш код

    }
}
