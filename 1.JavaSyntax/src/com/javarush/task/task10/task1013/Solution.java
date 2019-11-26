package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String secondName;
        private int age;
        private boolean sex;
        private String workPlace;
        private int workTimePerDay;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String secondName) {
            this.name = name;
            this.secondName = name;
        }

        public Human(String name, String secondName, int age, boolean sex) {
            this.name = name;
            this.secondName = secondName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String secondName, int age, boolean sex, String workPlace) {
            this.name = name;
            this.secondName = name;
            this.age = age;
            this.sex = sex;
            this.workPlace = workPlace;
        }

        public Human(String name, int age, boolean sex, String workPlace) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.workPlace = workPlace;
        }

        public Human(String name, String secondName, int age, boolean sex, String workPlace, int workTimePerDay) {
            this.name = name;
            this.secondName = name;
            this.age = age;
            this.sex = sex;
            this.workPlace = workPlace;
            this.workTimePerDay = workTimePerDay;
        }

        public Human(String name, int age, boolean sex, String workPlace, int workTimePerDay) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.workPlace = workPlace;
            this.workTimePerDay = workTimePerDay;
        }

        public Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }

        public Human(int age) {
            this.age = age;
        }
        // Напишите тут ваши переменные и конструкторы
    }
}
