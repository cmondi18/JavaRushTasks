package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String text = bufferedReader.readLine();
        int raz = Integer.parseInt(bufferedReader.readLine());

        while (raz != 0) {
            System.out.println(text);
            raz--;
        }
        //напишите тут ваш код

    }
}
