package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк и объединений их в одну строку
        String sMax = null;
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            sMax += s.toLowerCase();
        }

        // Проверяем коллекцию алфавита на наличие буквы в нашей текстовой строке, если присутствует - увеличиваем значение count
        for (char i : alphabet) {
            int count = 0;
            for (int j = 0; j < sMax.length(); j++) {
                if (sMax.charAt(j) == i) count++;
            }
            System.out.println(i + " " + count);
        }


        // напишите тут ваш код
    }

}
