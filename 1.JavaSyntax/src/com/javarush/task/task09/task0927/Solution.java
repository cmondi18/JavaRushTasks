package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<>();
        map.put("Vasya", new Cat("Vasya"));
        map.put("Kisya", new Cat("Kisya"));
        map.put("Ksss", new Cat("Ksss"));
        map.put("Meow", new Cat("Meow"));
        map.put("Mrr", new Cat("Mrr"));
        map.put("Myau", new Cat("Myau"));
        map.put("Murrr", new Cat("Murrr"));
        map.put("Myauuu", new Cat("Myauuu"));
        map.put("Murmur", new Cat("Murmur"));
        map.put("Gav", new Cat("Gav"));
        return map;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            cats.add(pair.getValue());
        }
        return cats;
        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
