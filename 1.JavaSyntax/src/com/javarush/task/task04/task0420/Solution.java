package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int min = 0;
        int sr = 0;
        int max = 0;

        if (a > b) { //  метод для а максимальное, б и ц - среднее и минимальное
            if (a > c) {
                max = a;
                if (c > b) {
                    sr = c;
                    min = b;
                } else {
                    sr = b;
                    min = c;
                }
                }
            else {
                max = c;
                sr = a;
                min = b;
                }
                } else if (b > c) { // метод для б максимальное, а и ц - среднее и минимальное
                    max = b;
                    if (a > c) {
                        sr = a;
                        min = c;
                    } else {
                        sr = c;
                        min = a;
                    }
                } else if (c > a) { // метод для ц максимальное, а и б - среднее и минимальное
                    max = c;
                    if (b > a) {
                        sr = b;
                        min = a;
                    } else {
                        sr = a;
                        min = b;
                    }
        }

        System.out.println(max + " " + sr + " " + min);

        //напишите тут ваш код
    }
}
