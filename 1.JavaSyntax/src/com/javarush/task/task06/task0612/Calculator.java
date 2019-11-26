package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a + b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a - b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a * b;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double div1;
        div1 = (double) a / b;
        return div1;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double per1;
        per1 = (double) a * b / 100;
        return per1;
    }

    public static void main(String[] args) {

    }
}