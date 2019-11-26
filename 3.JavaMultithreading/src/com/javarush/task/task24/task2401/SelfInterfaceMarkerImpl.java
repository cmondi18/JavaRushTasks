package com.javarush.task.task24.task2401;

public class SelfInterfaceMarkerImpl implements SelfInterfaceMarker {
    public void saySomthing() {
        System.out.println("HI");
    }

    public void sayGoodbye() {
        saySomthing();
        System.out.println("Gooodbye");
    }
}
