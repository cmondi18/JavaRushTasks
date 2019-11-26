package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        String line;
        String finalLine = "";
        while ((line = reader.readLine()) != null) {
            String[] buffer = line.split(" ");
            for (int i = 0; i < buffer.length; i++) {
                if (buffer[i].length() > 6) finalLine = finalLine + buffer[i] + ",";
        }
    }
        writer.write(finalLine.substring(0, finalLine.length() - 1));
        reader.close();
        writer.close();
    }
}
