package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(baos);
        System.setOut(stream);

        testString.printSomething();

        String result = baos.toString();

        System.setOut(consoleStream);

        String[] buffer = result.split(" ");
        int firstArgument = Integer.parseInt(buffer[0]);
        int secondArgument = Integer.parseInt(buffer[2]);
        String operation = buffer[1];

        String res = null;
        switch (operation) {
            case ("+") :
                res = String.valueOf(firstArgument + secondArgument);
                break;
            case ("-") :
                res = String.valueOf(firstArgument - secondArgument);
                break;
            case ("*") :
                res = String.valueOf(firstArgument * secondArgument);
                break;
        }

        System.out.print(result.trim() + " " + res);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

