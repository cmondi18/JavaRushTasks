package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        if (number < 0) number = number * -1; // проверка на отрицательность вводимого числа
        while (number >= 1) {
            int sostNumber = number % 10; // последняя цифра числа
            if (sostNumber % 2 == 0) even++; // проверка на четность
            else odd++;
            number = (number - sostNumber) / 10; // переход от сотни* к десяткам* и тд
        }
        System.out.println("Even: " + even + " Odd: " + odd);
        //напишите тут ваш код
    }
}
