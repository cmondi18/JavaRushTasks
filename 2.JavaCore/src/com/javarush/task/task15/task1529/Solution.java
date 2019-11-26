package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String type = reader.readLine();
            if (type.equals("helicopter")) result = new Helicopter();
            else if (type.equals("plane")) {
                int passengers = Integer.parseInt(reader.readLine());
                result = new Plane(passengers);
            }
            // result.fly();
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
