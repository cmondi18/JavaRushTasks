package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(br.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(br.readLine()));
        br.close();

        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            currentLine = currentLine.replace(".", "!");
            writer.write(currentLine);
        }

        reader.close();
        writer.close();

    }
}
