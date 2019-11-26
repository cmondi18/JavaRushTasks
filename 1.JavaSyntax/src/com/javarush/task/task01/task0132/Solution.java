package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int f1 = number / 100;
        number = number - (f1 * 100);
        int f2 = number / 10;
        int f3 = number - (f2 * 10);
        int summ = f1 + f2 + f3;
        return summ;
        //напишите тут ваш код
    }
}