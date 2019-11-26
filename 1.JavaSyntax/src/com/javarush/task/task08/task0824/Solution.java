package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // создаем 3 детей
        Human son1 = new Human("Dinar", true, 15);
        Human son2 = new Human("Vlad", true, 12);
        Human daughter = new Human("Maria", false, 4);
        // создаем лист детей и добавляем всех детей в него
        ArrayList<Human> childrens = new ArrayList<>();
        childrens.add(son1);
        childrens.add(son2);
        childrens.add(daughter);
        // создаем 2 родителей
        Human mother = new Human("Anastasia", false, 35, childrens);
        Human father = new Human("Pavel", true, 44, childrens);
        // создаем массив для мамы и папы и вносим их туда (для конструктора)
        ArrayList<Human> moth = new ArrayList<>();
        ArrayList<Human> fath = new ArrayList<>();
        moth.add(mother);
        fath.add(father);
        // создаем бабушек и дедушек
        Human grandfather1 = new Human("Anatole", true, 65, moth);
        Human grandfather2 = new Human("Rinat", true, 60, fath);
        Human grandmother1 = new Human("Zinaida", false, 65, moth);
        Human grandmother2 = new Human("Loosya", false, 60, fath);
        // создаем лист со всеми членами семьи и вносим их туда
        ArrayList<Human> allPeople = new ArrayList<>();
        allPeople.addAll(childrens);
        allPeople.add(mother);
        allPeople.add(father);
        allPeople.add(grandfather1);
        allPeople.add(grandfather2);
        allPeople.add(grandmother1);
        allPeople.add(grandmother2);
        // циклом проходимся по всем и выводим на экран
        for (Human i : allPeople) {
            System.out.println(i);
        }
        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
        // конструктор для бездетных
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        // конструктор для детных
        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(children);
        }
    }

}
