package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
        System.out.println(getPartOfString("Ah No"));
    }

    public static String getPartOfString(String string) {
        try {
            String[] text = string.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < 5; i++) {
                sb.append(text[i] + " ");
            }
            return sb.toString().trim();
        } catch (RuntimeException e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
