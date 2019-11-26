package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("OCTOBER 23 1980"));
        map.put("Bonucci", df.parse("JUNE 1 1913"));
        map.put("Buffon", df.parse("MAY 1 1980"));
        map.put("Ramos", df.parse("JANUARY 4 1988"));
        map.put("Zidane", df.parse("JULY 25 1981"));
        map.put("Mancini", df.parse("JUNE 13 1980"));
        map.put("Mbappe", df.parse("JUNE 14 1980"));
        map.put("Neymar", df.parse("JUNE 15 1980"));
        map.put("Quagriela", df.parse("MAY 2 1980"));
        map.put("Cuadrado", df.parse("AUGUST 1 1980"));

        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            if (value.getMonth() == 5 || value.getMonth() == 6 || value.getMonth() == 7) iterator.remove();
        }
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
