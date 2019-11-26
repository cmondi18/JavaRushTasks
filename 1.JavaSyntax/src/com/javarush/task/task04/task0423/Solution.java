package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String sAge = bufferedReader.readLine();
        int age = Integer.parseInt(sAge);

        if (age > 20) System.out.println("И 18-ти достаточно");
        //напишите тут ваш код
    }
}
