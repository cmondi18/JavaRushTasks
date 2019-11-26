package com.javarush.task.task20.task2003;

import javafx.beans.property.Property;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws IOException {
        //implement this method - реализуйте этот метод
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(br.readLine());
        br.close();
        try {
            load(fis);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties pro = new Properties();
        pro.putAll(properties);
        pro.store(outputStream, null);
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties pro = new Properties();
        pro.load(inputStream);
        for (String name : pro.stringPropertyNames()) {
            properties.put(name, pro.getProperty(name));
        }
    }

    public static void main(String[] args) {

    }
}
