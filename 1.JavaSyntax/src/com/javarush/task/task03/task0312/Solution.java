package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hour)
    {
        int seconds = hour * 60 * 60;
        return seconds;
    }
    //напишите тут ваш код

    public static void main(String[] args) {
        System.out.println(convertToSeconds(5));
        System.out.println(convertToSeconds(10));

        //напишите тут ваш код
    }
}
