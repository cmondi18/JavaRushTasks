package com.javarush.task.task12.task1233;

/* 
Изоморфы наступают
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        int min = array[0]; // переменная для минимального значения (изначально первый элемент массива)
        int minPositionInArray = 0; // переменная для позиции минимального значения (изначально первый элемент массива)

        // цикл для нахождения минимального значения и позиции в массиве
        for (int i = 0; i < array.length - 1; i++) {
            if (min > array[i + 1]) {
                min = array[i + 1];
                minPositionInArray = i + 1;
            }
        }
        //напишите тут ваш код

        return new Pair<Integer, Integer>(min, minPositionInArray);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
