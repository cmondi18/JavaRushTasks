package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];  // создаем массивы
        String[] letters = new String[10];

        for (int i = 0; i < letters.length; i++) { // цикл, где вносим в массив данные с клавиатуры, и сразу же записываем длину строки в массив
            letters[i] = reader.readLine();
            numbers[i] = letters[i].length();
        }

        for (int i = 0; i < numbers.length; i++) System.out.println(numbers[i]);  // выводим длину строк


        //напишите тут ваш код
    }
}
