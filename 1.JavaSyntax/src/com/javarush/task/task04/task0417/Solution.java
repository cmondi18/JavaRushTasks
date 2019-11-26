package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bufferedReader.readLine();
        String a2 = bufferedReader.readLine();
        String a3 = bufferedReader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(a2);
        int c = Integer.parseInt(a3);
        if (a == b) {
            if (a == c)
                System.out.println(a + " " + b + " " + c);
            else System.out.println(a + " " + b);

        }
        else if (b == c)
            System.out.println(b + " " + c);

        else if (a == c)
            System.out.println(a + " " + c);

        }
        //напишите тут ваш код
    }
