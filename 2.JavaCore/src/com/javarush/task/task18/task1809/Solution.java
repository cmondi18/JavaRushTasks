package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        FileOutputStream fos = new FileOutputStream(reader.readLine());
        reader.close();

        int count = 0;
        while (fis.available() > 0) {
            byte[] buffer = new byte[fis.available()];
            count = fis.read(buffer);

            for (int i = 0; i < buffer.length / 2; i++) {
                byte tmp = buffer[i];
                buffer[i] = buffer[buffer.length - i - 1];
                buffer[buffer.length - i - 1] = tmp;
            }

            fos.write(buffer, 0, count);
        }
        fos.close();
        fis.close();

    }
}
