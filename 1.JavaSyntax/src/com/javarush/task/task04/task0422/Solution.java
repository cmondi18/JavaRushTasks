package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String sYears = bufferedReader.readLine();
        int years = Integer.parseInt(sYears);

        if (years < 18) System.out.println("Подрасти еще");
        //напишите тут ваш код
    }
}
