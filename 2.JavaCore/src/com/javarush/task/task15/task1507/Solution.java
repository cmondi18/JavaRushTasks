package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m) {
        System.out.println(m);
    }

    public static void printMatrix(int m, int n) {
        System.out.println(m + n);
    }

    public static void printMatrix() {
        System.out.println("NOTHING");
    }

    public static void printMatrix(String s) {
        System.out.println("print" + s);
    }

    public static void printMatrix(String s, String x, int a) {
        System.out.println(s + x + " = " + a);
    }

    public static void printMatrix(Object i) {
        System.out.println(i);
    }

    public static void printMatrix(Object i, Object k) {
        System.out.println(i);
        System.out.println(k);
    }

    public static void printMatrix(int x, String xI) {
        System.out.println(x + " = " + xI);
    }
}
