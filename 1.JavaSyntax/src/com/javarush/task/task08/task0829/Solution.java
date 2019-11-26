package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        HashMap<String, String> addresses = new HashMap<>();
        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            addresses.put(town, family);
        }

        // Read the house number
        String townFamily = reader.readLine();
        for (Map.Entry<String, String> pair : addresses.entrySet()) {
            String key = pair.getKey();
            if (key.equals(townFamily)) System.out.println(pair.getValue());
        }
    }
}
