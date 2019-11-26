package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String firstName = args[0];
        String secondName = args[1];

        Charset windows = Charset.forName("Windows-1251");
        Charset UTF8 = Charset.forName("UTF-8");

        byte[] buffer = Files.readAllBytes(Paths.get(firstName));
        String s = new String(buffer, windows);

        FileOutputStream fos = new FileOutputStream(secondName);
        fos.write(s.getBytes(UTF8));
        fos.close();
    }
}
