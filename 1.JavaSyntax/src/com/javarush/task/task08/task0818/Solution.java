package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> salary = new HashMap<>();
        salary.put("Denis", 10000);
        salary.put("Ahmed", 300);
        salary.put("Ivan", 7000);
        salary.put("Tamara", 10000);
        salary.put("Misha", 150);
        salary.put("Conor", 1000000);
        salary.put("Tanya", 2000);
        salary.put("German", 100000);
        salary.put("Dmitriy", 10000);
        salary.put("Birabidjan", 10);

        return salary;
        //напишите тут ваш код
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<HashMap.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            Integer value = pair.getValue();
            if (value < 500) iterator.remove();
        }
        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}