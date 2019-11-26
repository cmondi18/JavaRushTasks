package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] stringArray = s.split("\\s++");
        for (String i : stringArray) {
            list.add(i.substring(0, 1).toUpperCase() + i.substring(1));
        }

        for (String i : list) {
            System.out.print(i + " ");
        }
        //напишите тут ваш код
    }
}
