package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int countplus = 0; // количество положительных чисел
        int countminus = 0; // количество отрицательных чисел

        for (int i = 0; i < 3; i++) {
            int count = Integer.parseInt(bufferedReader.readLine());
            if (count > 0) countplus = countplus + 1; // ввод 3х чисел из цикла и сравнение их с нулем
            else if (count < 0) countminus = countminus + 1;
        }

        System.out.println("количество отрицательных чисел: " + countminus);
        System.out.println("количество положительных чисел: " + countplus);
        //напишите тут ваш код

    }
}
