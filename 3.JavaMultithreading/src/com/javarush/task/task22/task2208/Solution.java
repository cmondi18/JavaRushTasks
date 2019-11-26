package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", null);
        map.put("city", null);
        map.put("age", null);

        System.out.println(getQuery(map));

    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> i : params.entrySet()) {
            if (i.getValue() != null) {
                sb.append(i.getKey() + " = '" + i.getValue() + "' and ");
            }
        }
        if (sb.toString().length() == 0) return "";
        else return sb.toString().substring(0, sb.toString().length() - 5);
    }
}
