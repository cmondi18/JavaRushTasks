package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Denis", 25, "Tomsk");
        Man man2 = new Man("Philipp", 25, "Australia");
        Woman wom1 = new Woman("Toma", 25, "Tomsk");
        Woman wom2 = new Woman("Gulchita", 45, "Azerbaijan");  // создаем 4 новых объекта с 3 параметрами
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(wom1.name + " " + wom1.age + " " + wom1.address);
        System.out.println(wom2.name + " " + wom2.age + " " + wom2.address);  // выводим на экран
        //напишите тут ваш код
    }

    public static class Man {  // создаем класс и конструктор с 3 перменными
       String name;
       int age;
       String address;

       public Man(String name, int age, String address) {
           this.name = name;
           this.age = age;
           this.address = address;
       }
    }

    public static class Woman {  // создаем класс и конструктор с 3 перменными
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    //напишите тут ваш код
}
