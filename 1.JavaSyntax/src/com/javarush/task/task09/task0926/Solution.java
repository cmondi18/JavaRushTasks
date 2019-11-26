package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int []> list = new ArrayList<>();
        int[] x = {0, 1, 2, 3, 4,};
        int[] y = {0, 1};
        int[] z = {0, 1, 2, 3};
        int[] w = {0, 1, 2, 3, 4, 5, 6};
        int[] j = new int[0];
        list.add(x);
        list.add(y);
        list.add(z);
        list.add(w);
        list.add(j);

        return list;
        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
