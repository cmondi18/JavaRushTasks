package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        // вводим две строки с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberOne = reader.readLine();
        String numberTwo = reader.readLine();

        // преобразуем строки в числа с учетом возможного исключения (условия задачи)
        int num1 = 0;
        int num2 = 0;

        num1 = Integer.parseInt(numberOne);
        num2 = Integer.parseInt(numberTwo);
        if (num1 <= 0 || num2 <= 0) throw new Exception();



        int NOD1; // переменная для хранения НОДа

        // сравниаем два значения для нахождения наименьшего, с цикла последовательно ищем на какое число делятся оба без остатка (начиная с наименьше числа до 0)
        for (int i = Math.min(num1, num2); i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                NOD1 = i;
                System.out.println(NOD1);
                break;
            }
        }
    }
}

