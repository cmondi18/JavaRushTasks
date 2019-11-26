package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new infinityThread());
        threads.add(new interruptedThread());
        threads.add(new YraThread());
        threads.add(new MessageThread());
        threads.add(new NThread());
    }

    public static void main(String[] args) {
    }

    public static class infinityThread extends Thread {
        public void run() {

            while (true) {

            }
        }
    }

    public static class interruptedThread extends Thread {
        public void run() {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class YraThread extends Thread {
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }

        }
    }

    public static class MessageThread extends Thread implements Message {
        public static boolean isAlive = true;

        @Override
        public void showWarning() {
            isAlive = false;
        }

        public void run() {
            while (isAlive) {

            }
        }
    }

    public static class NThread extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        public static int count = 0;

        public void run() {
            while (true) {
                try {
                    String text = reader.readLine();
                    if (text.equals("N")) {
                        System.out.println(count);
                } else {
                        count += Integer.parseInt(text);
                    }
                } catch (IOException e) {

                }
            }
        }
    }
}