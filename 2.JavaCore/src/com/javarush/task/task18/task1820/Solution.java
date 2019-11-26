package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // считываем название файлов для записи
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        // потоки для чтения и записи файлов
        BufferedReader file1Reader = new BufferedReader(new FileReader(file1));
        FileWriter file2Output = new FileWriter(file2);
        String line;


        while ((line = file1Reader.readLine()) != null) { // пока есть доступные строки - считываем
            String[] numbers = line.split(" "); // заносим в текстовый массив числа, находя их по разделителю (пробелу)

            // считываем массив, преоразуем в double при этом округляя до целых. Далее записываем в файл через пробел
            for (int i = 0; i < numbers.length; i++) {
                double num = Math.round(Double.parseDouble(numbers[i]));
                file2Output.write((int) num + " ");
            }
        }

        // закрываем потоки
        file1Reader.close();
        file2Output.close();

    }
}
