package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int countSpace = 0;
        int countOfAll = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data == 32) {
                countSpace++;
            }
            countOfAll++;
        }
        
        System.out.println(String.format("%.2f", (float)countSpace / countOfAll * 100.0));
        inputStream.close();
    }
}
