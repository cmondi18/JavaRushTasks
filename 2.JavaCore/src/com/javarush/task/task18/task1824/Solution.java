package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileNames = null;
         try {
            fileNames = reader.readLine();
            FileInputStream inputStream = new FileInputStream(fileNames);
            inputStream.close();
         } catch (FileNotFoundException e) {
             System.out.println(fileNames);
             break;
         } catch (IOException e) {
             System.out.println(e);
         }
        }
    }
}
