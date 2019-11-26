package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd" + " " + "MM" + " " + "yyyy");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));  // нагуглил решение, подцепил три библиотеки и исправил формат
        //напишите тут ваш код
    }
}
