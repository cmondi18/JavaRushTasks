package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100, 80.00));
        System.out.println(convertEurToUsd(200, 50.00));
        //напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course) {
        return eur * course;
        //напишите тут ваш код
    }
}
