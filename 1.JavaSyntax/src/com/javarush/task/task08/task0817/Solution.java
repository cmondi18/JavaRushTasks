package com.javarush.task.task08.task0817;

import java.text.CollationElementIterator;
import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> list = new HashMap<>();
        list.put("McGregor", "Conor");
        list.put("McDallas", "Conor");
        list.put("Brutto", "Netto");
        list.put("Koklushkin", "Mikhail");
        list.put("Tolstoy", "Ivan");
        list.put("Russian", "Ivan");
        list.put("Ukraine", "Taras");
        list.put("Bulba", "Taras");
        list.put("Ferdinand", "Rio");
        list.put("McNuggets", "Conor");

        return list;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> copyValues = new ArrayList<>();
        copyValues.addAll(map.values());
        for (String s : copyValues) {
            if (Collections.frequency(copyValues, s) > 1) removeItemFromMapByValue(map, s);
        }
        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
