package com.javarush.task.task08.task0814;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(51);
        numbers.add(15);
        numbers.add(3);
        numbers.add(4);
        numbers.add(8);
        numbers.add(18);
        numbers.add(42);
        numbers.add(1);
        numbers.add(25);
        numbers.add(50);
        numbers.add(510);
        numbers.add(105);
        numbers.add(30);
        numbers.add(40);
        numbers.add(80);
        numbers.add(180);
        numbers.add(420);
        numbers.add(10);
        numbers.add(250);

        return numbers;
        // напишите тут ваш код

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int x = iterator.next();
            if (x > 10) iterator.remove();
        }
        return set;
        // напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
