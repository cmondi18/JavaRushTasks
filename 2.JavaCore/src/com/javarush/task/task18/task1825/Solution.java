package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> names = new TreeSet<>();
        String line;

        while (!(line = reader.readLine()).equals("end")) {
            names.add(line);
        }
        reader.close();

        FileOutputStream fos = new FileOutputStream(names.first().substring(0, names.first().lastIndexOf(".part")));
        for (String s : names) {
            FileInputStream fis = new FileInputStream(s);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fos.write(buffer);
            fis.close();
        }
        fos.close();
    }
}
