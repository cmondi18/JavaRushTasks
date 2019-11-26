package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double summ = 0;
        int count = 0;
        while (true) {
            int chislo = Integer.parseInt(bufferedReader.readLine());
            if (chislo == -1)
                    break;
            else {
                summ = summ + chislo;
                count++;
            }
        }
        System.out.println(summ / count);
        //напишите тут ваш код
    }
}

