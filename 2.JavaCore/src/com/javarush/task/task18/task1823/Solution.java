package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (!(fileName = reader.readLine()).equals("exit")) {
            ReadThread thread = new ReadThread(fileName);
            thread.start();
        }
    }

    public static class ReadThread extends Thread {
        String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            super(fileName);
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        TreeMap<Integer, Integer> currentMap = new TreeMap<>();
        public void run() {
            try {
                FileInputStream fis = new FileInputStream(fileName);
                while (fis.available() > 0) {
                    Integer b = fis.read();
                    if (currentMap.containsKey(b)) {
                        currentMap.put(b, currentMap.get(b) + 1);
                    } else {
                        currentMap.put(b, 1);
                    }
                }
                fis.close();

                Integer key = Collections.max(currentMap.entrySet(), Map.Entry.comparingByValue()).getKey(); // получаем ключ для максимально повторяющегося байта
                resultMap.put(fileName, key);

            } catch (FileNotFoundException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
