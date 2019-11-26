package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Считываем названия файлов
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = null;
        String fileName2 = null;
        try {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            reader.close();
        } catch (IOException e) {

        }

        // Считываем строки из файлов
        try {
            BufferedReader linesReader1 = new BufferedReader(new FileReader(fileName1));
            String line1;
            while ((line1 = linesReader1.readLine()) != null) {
                allLines.add(line1);
            }
            linesReader1.close();

            BufferedReader linesReader2 = new BufferedReader(new FileReader(fileName2));
            String line2;
            while ((line2 = linesReader2.readLine()) != null) {
                forRemoveLines.add(line2);
            }
            linesReader2.close();

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }

        // Запускаем join
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {

        }

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
