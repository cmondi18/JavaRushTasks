package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public abstract class Human implements CanRun, CanSwim {

    }

    public interface CanSwim {
        public void swin();
    }

    public interface CanRun {
        public void run();
    }

    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут
}
