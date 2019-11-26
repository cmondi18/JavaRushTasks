package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(br.readLine());
        FileWriter writer = new FileWriter(br.readLine());
        br.close();
        int count = 1;
        while (reader.ready()) {
            int data = reader.read();
            if (count % 2 == 0) writer.write(data);
            count++;
        }
        reader.close();
        writer.close();
    }
}
