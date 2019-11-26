package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        int timedmax = 1; // текущий максимум (как минимум 1)
        int max = 1; // максимальный в листе (как минимум 1)

        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(reader.readLine())); // заполняем лист
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) { // сравниваем текущий элемент списка с последующим
                timedmax++; // если равны - увеличиваем текущий максимум
                if (timedmax > max) max = timedmax; // если текущий максимум больше максимального в листе - перезаписываем
            } else timedmax = 1; // если нет - восстанавливаем значение единицы
        }

        System.out.println(max);
        //напишите тут ваш код

    }
}