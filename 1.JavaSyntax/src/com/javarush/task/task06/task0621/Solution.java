package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine(); // создаем 6 объектов с назначением имени и родственников
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandFather.toString()); // запускаем метод toString для вывода семейного родства
        System.out.println(catGrandMother.toString());
        System.out.println(catFather.toString());
        System.out.println(catMother.toString());
        System.out.println(catSon.toString());
        System.out.println(catDaughter.toString());
    }

    public static class Cat {
        private String name;
        private Cat parentMother;
        private Cat parentFather;

        Cat(String name) { // методы для имени, имени и матери, имени и матери и отца
            this.name = name;
        }

        Cat(String name, Cat parentMother) {
            this.name = name;
            this.parentMother = parentMother;
        }

        Cat(String name, Cat parentMother, Cat parentFather) {
            this.name = name;
            this.parentMother = parentMother;
            this.parentFather = parentFather;
        }

        @Override
        public String toString() { // проверяем наличие отца и матери и возвращаем соответствующую строку в метод
            if (parentMother == null && parentFather == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if (parentMother != null && parentFather != null)
                return "The cat's name is " + name + ", mother is " + parentMother.name + ", father is " + parentFather.name;
            else if (parentMother != null && parentFather == null)
                return "The cat's name is " + name + ", mother is " + parentMother.name + ", no father";
            else
                return "The cat's name is " + name + ", no mother, father is " + parentFather.name;
        }
    }

}
