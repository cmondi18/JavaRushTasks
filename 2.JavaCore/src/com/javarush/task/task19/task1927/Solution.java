package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        byte[] buffer = outputStream.toByteArray();

        System.setOut(consoleStream);

        int count = 0;
        for (int i = 0; i < buffer.length; i++) {
            System.out.print((char) buffer[i]);
            if (buffer[i] == 10) count++;
            if (count == 2) {
                    System.out.println("JavaRush - курсы Java онлайн");
                    count = 0;
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
