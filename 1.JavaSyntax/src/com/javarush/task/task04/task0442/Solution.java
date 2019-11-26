package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int summ = 0;
        while (true) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number == -1) {
                summ = summ + number;
                break;
            } else summ = summ + number;
        }
        System.out.println(summ);
        //напишите тут ваш код
    }
}
