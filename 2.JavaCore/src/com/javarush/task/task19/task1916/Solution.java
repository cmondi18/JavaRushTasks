package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(br.readLine()));
        BufferedReader reader2 = new BufferedReader(new FileReader(br.readLine()));
        br.close();

        String line;
        ArrayList<String> file1 = new ArrayList<>();
        ArrayList<String> file2 = new ArrayList<>();

        // заполняем в лист строки первого файла
        while ((line = reader1.readLine()) != null) {
            file1.add(line);
        }
        reader1.close();
        // ... и второго
        while ((line = reader2.readLine()) != null) {
            file2.add(line);
        }
        reader2.close();

        int index1 = 0;
        int index2 = 0;

        // проходимся по файлу и сравниваем строки
        while (index1 < file1.size() && index2 < file2.size()) {
            if (file1.get(index1).equals(file2.get(index2))) {
                lines.add(new LineItem(Type.SAME, file1.get(index1)));
                index1++;
                index2++;
            } else if (index1 + 1 < file1.size() && file1.get(index1 + 1).equals(file2.get(index2))) {
                lines.add(new LineItem(Type.REMOVED, file1.get(index1++)));
            } else if (index2 + 1 < file2.size() && file1.get(index1).equals(file2.get(index2 + 1))) {
                lines.add(new LineItem(Type.ADDED, file2.get(index2++)));
            }
        }

        // могут остаться по одному значению в конце, проверяем
        if (index1 == file1.size() && index2 < file2.size()) {
            lines.add(new LineItem(Type.ADDED, file2.get(index2)));
        }
        if (index2 == file2.size() && index1 < file1.size()) {
            lines.add(new LineItem(Type.REMOVED, file1.get(index1)));
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
