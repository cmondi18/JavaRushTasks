package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dataPlaceName = reader.readLine(); // вписываем название файла для дальнейщей записи

        FileWriter fWriter = new FileWriter(dataPlaceName); // поток для подключения к текстовому файлу
        BufferedWriter writer = new BufferedWriter(fWriter); // соединение FileWriter и BufferedWriter

        // цикл записывает строки в файл, до тех пор, пока пользователь не введет строку exit
        while (true) {
            String line = reader.readLine();
            if (line.equals("exit")) {
                writer.write(line + "\n");
                break;
            }
            else writer.write(line + "\n");
        }

        reader.close();
        writer.close();
        // напишите тут ваш код
    }
}
