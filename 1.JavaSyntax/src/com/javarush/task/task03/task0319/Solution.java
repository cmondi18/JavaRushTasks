package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String szp = reader.readLine();
        int izp = Integer.parseInt(szp);
        String slet = reader.readLine();
        int ilet = Integer.parseInt(slet);
        System.out.println(name + " получает " +izp + " через " + ilet + " лет.");


        //напишите тут ваш код
    }
}
