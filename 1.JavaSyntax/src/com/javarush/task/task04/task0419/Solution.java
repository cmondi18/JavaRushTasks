package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String aA = bufferedReader.readLine();
        int a = Integer.parseInt(aA);
        String bB = bufferedReader.readLine();
        int b = Integer.parseInt(bB);
        String cC = bufferedReader.readLine();
        int c = Integer.parseInt(cC);
        String dD = bufferedReader.readLine();
        int d = Integer.parseInt(dD);

        int max = 0;

        if (a >= b & a >= c)
            max = a;
        else if (b >= c)
            max = b;
        else max = c;

        if (d >= max)
            max = d;

        System.out.println(max);
    }



        //напишите тут ваш код
    }

