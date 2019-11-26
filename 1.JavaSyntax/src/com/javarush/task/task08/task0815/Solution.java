package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> glossary = new HashMap<>();
        glossary.put("Сиволап", "Денис");
        glossary.put("Аркмистров", "Иван");
        glossary.put("Зурабов", "Мухамед");
        glossary.put("Иванов", "Денис");
        glossary.put("Петров", "Иван");
        glossary.put("Летучая", "Елена");
        glossary.put("Кривов", "Тарас");
        glossary.put("Бульба", "Тарас");
        glossary.put("Журкин", "Денис");
        glossary.put("Израилев", "Бадург");
        //напишите тут ваш код
        return glossary;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int countFirstName = 0;
        Iterator<HashMap.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (value.equals(name)) countFirstName++;
        }
        return countFirstName;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int countLastName = 0;
        Iterator<HashMap.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if (key.equals(lastName)) countLastName++;
        }
        return countLastName;
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
