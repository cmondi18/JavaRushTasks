package com.javarush.task.task19.task1904;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();
        FileInputStream fis = new FileInputStream(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
        String personLine = reader.readLine();

        String[] array = personLine.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] array = fileScanner.nextLine().split("\\s");
            String date = array[3] + " " + array[4] + " " + array[5];
            DateFormat format = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            Date birth = null;
            try {
                birth = format.parse(date);
            } catch (ParseException e) {
                System.out.println(e);
            }
            return new Person(array[1], array[2], array[0], birth);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
