package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[5]; // создаем массив из 5 чисел
        for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(reader.readLine()); // заполняем массив 5 числами с клавиатуры

        for (int i = arr.length - 1; i > 0; i--) { // используем метод Bubble, сравниваем соседние числа масива и меняем их местами, если предыдущее больше следыдущего
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int max = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = max;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) { // выводим результат
            System.out.println(arr[i]);

            //напишите тут ваш код
        }
    }
}
