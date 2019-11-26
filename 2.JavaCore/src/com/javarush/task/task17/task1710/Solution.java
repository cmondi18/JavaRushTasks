package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут

        switch (args[0]) {
            case ("-c"):
                addNew(args);
                break;

            case ("-u"):
                update(args);
                break;

            case ("-d"):
                deletePeople(args);
                break;

            case ("-i"):
                showInformation(args);
                break;
        }
    }

    public static void addNew(String[] arguments) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date birthday = null;

        try {
            birthday = format.parse(arguments[3]);
        }catch (ParseException e) {
            System.out.println(e);
        }

        if (arguments[2].equals("м")) {
            allPeople.add(Person.createMale(arguments[1], birthday));
            System.out.println(allPeople.size() - 1);
        } else if (arguments[2].equals("ж")) {
            allPeople.add(Person.createFemale(arguments[1], birthday));
            System.out.println(allPeople.size() - 1);
        }
    }

    public static void update(String[] arguments) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date birthday = null;

        try {
            birthday = format.parse(arguments[4]);
        }catch (ParseException e) {
            System.out.println(e);
        }

        allPeople.get(Integer.parseInt(arguments[1])).setName(arguments[2]);
        if (arguments[3].equals("м")) {
            allPeople.get(Integer.parseInt(arguments[1])).setSex(Sex.MALE);
        }else if (arguments[3].equals("ж")) {
            allPeople.get(Integer.parseInt(arguments[1])).setSex(Sex.FEMALE);
        }
        allPeople.get(Integer.parseInt(arguments[1])).setBirthDate(birthday);
    }

    public static void deletePeople(String[] arguments) {
        allPeople.get(Integer.parseInt(arguments[1])).setName(null);
        allPeople.get(Integer.parseInt(arguments[1])).setSex(null);
        allPeople.get(Integer.parseInt(arguments[1])).setBirthDate(null);
    }

    public static void showInformation(String[] arguments) {
        System.out.print(allPeople.get(Integer.parseInt(arguments[1])).getName() + " ");
        if (allPeople.get(Integer.parseInt(arguments[1])).getSex().equals(Sex.FEMALE)) {
            System.out.print("ж ");
        } else if (allPeople.get(Integer.parseInt(arguments[1])).getSex().equals(Sex.MALE)) {
            System.out.print("м ");
        }
        DateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        System.out.print(format.format(allPeople.get(Integer.parseInt(arguments[1])).getBirthDate()));
    }
}
