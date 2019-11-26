package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String today = reader.readLine(); // вводим дату

        DateFormat oldFormat = new SimpleDateFormat("yyyy-MM-d");
        Date todayDate = oldFormat.parse(today); // приводим нашу вводимую строку в формат даты

        SimpleDateFormat newFormat = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        System.out.println(newFormat.format(todayDate).toUpperCase()); // переводим наш формат даты в требуемый
        //напишите тут ваш код
    }
}
