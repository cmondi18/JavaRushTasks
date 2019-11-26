package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(args[0]));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        TreeMap<String, Double> map = new TreeMap<>();
        String line;
        double max = Integer.MIN_VALUE;
        while ((line = reader.readLine()) != null) {
            String[] buffer = line.split(" ");
            if (map.containsKey(buffer[0])) {
                Double totalMoney = map.get(buffer[0]) + Double.parseDouble(buffer[1]);
                map.put(buffer[0], totalMoney);
                if (totalMoney > max) max = totalMoney;
            } else  {
                map.put(buffer[0], Double.parseDouble(buffer[1]));
                if (Double.parseDouble(buffer[1]) > max) max = Double.parseDouble(buffer[1]);
            }
        }
        reader.close();

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) System.out.println(entry.getKey());
        }
    }
}
