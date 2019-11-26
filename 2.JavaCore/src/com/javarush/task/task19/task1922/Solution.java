package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(br.readLine()));
        br.close();
        String line;

        while ((line = reader.readLine()) != null) {
            String[] buffer = line.split(" ");
            int count = 0;
            for (int i = 0; i < buffer.length; i++) {
                for (int m = 0; m < words.size(); m++) {
                    if (words.get(m).equals(buffer[i])) count++;
                }
            }
            if (count == 2) System.out.println(line);
        }
        reader.close();

    }
}
