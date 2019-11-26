package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human hum1 = new Human("Vlad", true, 15);
        Human hum2 = new Human("Junior", true, 25);
        Human hum3 = new Human("Senior", true, 55);
        Human hum4 = new Human("Susana", false, 50);
        Human hm1 = new Human("Michel", true, 3, hum3, hum4);
        Human hm2 = new Human("Popen", true, 25, hum3, hum4);
        Human hm3 = new Human("Dzanfran", true, 17, hum3, hum4);
        Human hm4 = new Human("Robbien", true, 25, hum3, hum4);
        Human hm5 = new Human("Goodie", false, 35, hum3, hum4);
        // напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            System.out.println();
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            System.out.println();
        }

        // напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}