package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
            FileInputStream fis = null;
            FileOutputStream fos = null;
        try {
            fis = new FileInputStream(args[1]);
            fos = new FileOutputStream(args[2]);
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
        }
        if (args[0].equals("-e")) {
            int a;
            while ((a = fis.read()) != -1) {
                fos.write(a + 1);
            }
            fis.close();
            fos.close();
        } else if (args[0].equals("-d")) {
            int a;
            while ((a = fis.read()) != -1) {
                fos.write(a - 1);
            }
            fis.close();
            fos.close();
        }
    }

}
