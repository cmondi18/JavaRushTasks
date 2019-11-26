package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        String[] a = getTokens("level22.lesson13.task01", ".");
        for (String i : a) {
            System.out.println(i);
        }
    }

    public static String [] getTokens(String query, String delimiter) {
        ArrayList<String> temp = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        while (tokenizer.hasMoreTokens()) {
            temp.add(tokenizer.nextToken());
        }
        String[] tokens = new String[temp.size()];
        temp.toArray(tokens);
        return tokens;
    }
}
