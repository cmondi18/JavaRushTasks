package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        String line;

        while ((line = fileReader.readLine()) != null) {
            String[] parametres = line.split(" ");
            if (parametres[0].equals(args[0])) {
                for (int i = 0; i < parametres.length; i++) {
                    System.out.print(parametres[i] + " ");
                    break;
                }
            }
        }
        fileReader.close();

    }
}
