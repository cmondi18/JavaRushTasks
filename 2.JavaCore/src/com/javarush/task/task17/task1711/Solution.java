package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут

        switch (args[0]) {
            case ("-c"):
                synchronized (allPeople) {
                    addNew(args);
                    break;
                }

            case ("-u"):
                synchronized (allPeople) {
                    update(args);
                    break;
                }

            case ("-d"):
                synchronized (allPeople) {
                    deletePeople(args);
                    break;
                }

            case ("-i"):
                synchronized (allPeople) {
                    showInformation(args);
                    break;
                }
        }

    }

    public static void addNew(String[] arguments) {
        for (int i = 1; i < arguments.length; i = i + 3) {
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date birthday = null;

            try {
                birthday = format.parse(arguments[i + 2]);
            } catch (ParseException e) {
                System.out.println(e);
            }

            if (arguments[i + 1].equals("м")) {
                allPeople.add(Person.createMale(arguments[i], birthday));
                System.out.println(allPeople.size() - 1);
            } else if (arguments[i + 1].equals("ж")) {
                allPeople.add(Person.createFemale(arguments[i], birthday));
                System.out.println(allPeople.size() - 1);
            }
        }
    }

    public static void update(String[] arguments) {
        for (int i = 1; i < arguments.length; i = i + 4) {
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date birthday = null;

            try {
                birthday = format.parse(arguments[i + 3]);
            } catch (ParseException e) {
                System.out.println(e);
            }

            allPeople.get(Integer.parseInt(arguments[i])).setName(arguments[i + 1]);
            if (arguments[i + 2].equals("м")) {
                allPeople.get(Integer.parseInt(arguments[i])).setSex(Sex.MALE);
            } else if (arguments[i + 2].equals("ж")) {
                allPeople.get(Integer.parseInt(arguments[i])).setSex(Sex.FEMALE);
            }
            allPeople.get(Integer.parseInt(arguments[i])).setBirthDate(birthday);
        }
    }

    public static void deletePeople(String[] arguments) {
        for (int i = 1; i < arguments.length; i++) {
            allPeople.get(Integer.parseInt(arguments[i])).setName(null);
            allPeople.get(Integer.parseInt(arguments[i])).setSex(null);
            allPeople.get(Integer.parseInt(arguments[i])).setBirthDate(null);
        }
    }

    public static void showInformation(String[] arguments) {
        for (int i = 1; i < arguments.length; i++) {
            System.out.print(allPeople.get(Integer.parseInt(arguments[i])).getName() + " ");
            if (allPeople.get(Integer.parseInt(arguments[i])).getSex().equals(Sex.FEMALE)) {
                System.out.print("ж ");
            } else if (allPeople.get(Integer.parseInt(arguments[i])).getSex().equals(Sex.MALE)) {
                System.out.print("м ");
            }
            DateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            System.out.println(format.format(allPeople.get(Integer.parseInt(arguments[i])).getBirthDate()));
        }
    }
}
