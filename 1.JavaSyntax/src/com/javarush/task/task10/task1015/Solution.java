package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("HI");
        list1.add("ARRAY");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("BYE");
        list2.add("COLLECTION");

        ArrayList<String>[] array =  new ArrayList[2];
        array[0] = list1;
        array[1] = list2;
        //напишите тут ваш код

        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}