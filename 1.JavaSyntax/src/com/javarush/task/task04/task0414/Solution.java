package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = bufferedReader.readLine();
        int year = Integer.parseInt(sYear);

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println("количество дней в году: 366");
                else System.out.println("количество дней в году: 365");
            }
            else System.out.println("количество дней в году: 366");
            }
        else System.out.println("количество дней в году: 365");
        }
        //напишите тут ваш код
    }
