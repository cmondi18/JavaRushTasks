package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) { // заполняем массив
            list.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) { // будущую удаленку записываем в стринг, удалаем и вновь заносим ее в начало массива
            String delete = list.get(4);
            list.remove(4);
            list.add(0, delete);
        }

        for (int i = 0; i < 5; i++) { // выводим массив
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}
