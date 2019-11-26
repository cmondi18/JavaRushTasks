package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] java = s.toCharArray(); // переводим строку в массив символов
        ArrayList<String> javaNew = new ArrayList<>(); // создаем новую коллекцию для хранения и последующего удалений элементов строки

        // вносим значение массива в коллекцию
        for (int i = 0; i < java.length; i++) {
            javaNew.add(String.valueOf(java[i]));
        }

        // выводим строку, после чего удаляем первый элемент коллекции
        for (int i = 0; i < 40; i++) {
            for (String j : javaNew) {
                System.out.print(j);
            }
            javaNew.remove(0);
            System.out.println();
        }
        //напишите тут ваш код
    }

}

