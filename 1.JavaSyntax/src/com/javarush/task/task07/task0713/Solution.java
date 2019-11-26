package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mainlist = new ArrayList<>(); // основной массив
        ArrayList<Integer> division3 = new ArrayList<>(); // массив для кратных 3
        ArrayList<Integer> division2 = new ArrayList<>(); // массив для кратных 2
        ArrayList<Integer> others = new ArrayList<>(); // массив для всех остальных
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) { // заносим значения в основной массив
            mainlist.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < mainlist.size(); i++) { // находим кратные 2 и 3 значения и вносим их в массивы
            Integer x = mainlist.get(i);
            if (x % 3 == 0) division3.add(mainlist.get(i));
            if (x % 2 == 0) division2.add(mainlist.get(i));
            if (x % 3 > 0 && x % 2 > 0) others.add(mainlist.get(i));
        }

        printList(division3); // выводим массивы на экран
        printList(division2);
        printList(others);
        //напишите тут ваш код
    }

    public static void printList(List<Integer> list) { // метод для вывода всего массива на экран
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}
