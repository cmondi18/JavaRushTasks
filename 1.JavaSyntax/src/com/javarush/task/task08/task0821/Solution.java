package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> people = new HashMap<>();
        people.put("Иванов", "Иван");
        people.put("Иванов", "Михаил");
        people.put("Петров", "Иван");
        people.put("Коклюшкин", "Иван");
        people.put("Резяпов", "Семен");
        people.put("Семенов", "Семен");
        people.put("Коклюшкин", "Макс");
        people.put("Васечкин", "Иван");
        people.put("Тормозов", "Иван");
        people.put("Бубров", "Гайтан");
        //напишите тут ваш код

        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
