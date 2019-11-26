package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(br.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(br.readLine()));
        br.close();

        String text = "";
        while (reader.ready()) {
            int data = reader.read();
            text = text + (char) data;
        }
        reader.close();

        String[] buffer = text.split(" ");
        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i].matches("-?\\d+(\\.\\d+)?")) writer.write(buffer[i] + " ");
        }
        writer.close();
    }
}
