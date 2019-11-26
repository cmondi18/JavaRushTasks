package com.javarush.task.task16.task1630;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = nameReader.readLine();
            secondFileName = nameReader.readLine();
            nameReader.close();
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fullFileName;
        String allLinesInOne = "";

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return allLinesInOne;
        }

        public void run() {
            ArrayList<String> listOfLines = new ArrayList<>();
            try {
                BufferedReader linesReader = new BufferedReader(
                        new InputStreamReader(new FileInputStream(fullFileName), StandardCharsets.UTF_8));
                String line;
                while ((line = linesReader.readLine()) != null) {
                    listOfLines.add(line);
                }
                linesReader.close();
            } catch (IOException e) {

            }

            allLinesInOne = String.join(" ", listOfLines);
        }
    }
}
