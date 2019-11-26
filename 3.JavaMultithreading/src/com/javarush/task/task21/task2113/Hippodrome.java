package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void move() {
        for (Horse i : horses) {
            i.move();
        }
    }

    public void print() {
        for (Horse i : horses) {
            i.print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public Horse getWinner() {
        Horse winner = null;
        double winnerDistance = 0;
        for (Horse i : horses) {
            if (i.distance > winnerDistance) {
                winnerDistance = i.distance;
                winner = i;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }




    public static void main(String[] args) throws InterruptedException {
        List<Horse> yard = new ArrayList<>();
        yard.add(new Horse("Yasha", 3, 0));
        yard.add(new Horse("Igogo", 3, 0));
        yard.add(new Horse("Horsique", 3, 0));
        game = new Hippodrome(yard);
        game.run();
        game.printWinner();
    }
}
