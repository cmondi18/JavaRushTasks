package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();

        int lenghtName1 = name1.length();
        int lenghtName2 = name2.length();

        if (name1.equals(name2))
            System.out.println("Имена идентичны");
        else if (lenghtName1 == lenghtName2)
            System.out.println("Длины имен равны");
        //напишите тут ваш код
    }
}
