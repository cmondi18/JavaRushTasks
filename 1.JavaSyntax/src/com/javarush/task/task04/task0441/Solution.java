package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int summ = a + b + c; // сумма всех трех
        int maximum = Math.max(a, Math.max(b, c)); // максимальное из трех
        int minimum = Math.min(a, Math.min(b, c)); // минимальное из трех

        int middle = summ - maximum - minimum; // находим среднее путем вычета из суммы максимального и минимального

        System.out.println(middle);

        //напишите тут ваш код
    }
}
