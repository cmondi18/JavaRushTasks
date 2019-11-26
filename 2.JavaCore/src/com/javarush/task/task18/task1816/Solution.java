package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int count = 0;
        while (inputStream.available() > 0) {
            char data = (char) inputStream.read();
            if ((data >= 'a' && data <= 'z') || (data >= 'A' && data <= 'Z')) count++;
        }
        inputStream.close();
        System.out.println(count);
    }
}
