package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String current = reader.readLine();
        char[] x = current.toCharArray();
        ArrayList<String> vowel = new ArrayList<>();
        ArrayList<String> notVowel = new ArrayList<>();
        for (char i : x) {
            if (isVowel(i) == true) vowel.add(String.valueOf(i));
            else if (i == ' ');
            else notVowel.add(String.valueOf(i));
        }

        for (String i : vowel) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (String i : notVowel) {
            System.out.print(i + " ");
        }
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}