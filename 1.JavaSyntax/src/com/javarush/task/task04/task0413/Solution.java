package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String day = bufferedReader.readLine();
        int dday = Integer.parseInt(day);
        if (dday < 1 || dday > 7)
            System.out.println("такого дня недели не существует");
        else if (dday == 1)
            System.out.println("понедельник");
        else if (dday == 2)
            System.out.println("вторник");
        else if (dday == 3)
            System.out.println("среда");
        else if (dday == 4)
            System.out.println("четверг");
        else if (dday == 5)
            System.out.println("пятница");
        else if (dday == 6)
            System.out.println("суббота");
        else if (dday == 7)
            System.out.println("воскресенье");

        //напишите тут ваш код
    }
}