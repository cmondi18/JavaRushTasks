package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    int numbersOfPassengers;

    public void fly() {
        System.out.println("Plane is flying with " + numbersOfPassengers + " passengers");
    }

    public Plane(int numbersOfPassengers) {
        this.numbersOfPassengers = numbersOfPassengers;
    }
}
