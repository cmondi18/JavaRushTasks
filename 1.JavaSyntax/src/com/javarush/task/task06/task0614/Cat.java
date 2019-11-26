package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList <Cat> cats = new ArrayList<Cat>(); // создали массив cats
    //напишите тут ваш код

    public Cat() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {  // с помощью цикла создаем 10 объектов котов и добавляем в массив
            Cat cat = new Cat();
            cats.add(cat);
        }
        //напишите тут ваш код
        printCats();
    }

    public static void printCats() {
        cats.forEach(System.out::println); // команда для вывода каждого элемента массива
        //напишите тут ваш код
    }
}
