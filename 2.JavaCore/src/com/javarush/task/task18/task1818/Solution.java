package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOne = new FileOutputStream(reader.readLine());
        FileInputStream fileTwo = new FileInputStream(reader.readLine());
        FileInputStream fileThree = new FileInputStream(reader.readLine());
        reader.close();

        int count = 0;
        int count2 = 0;
        byte[] buffer = new byte[fileTwo.available()];
        byte[] buffer2 = new byte[fileThree.available()];

        fileTwo.read(buffer);
        fileOne.write(buffer);

        fileThree.read(buffer2);
        fileOne.write(buffer2);


        fileOne.close();
        fileTwo.close();
        fileThree.close();

    }
}
