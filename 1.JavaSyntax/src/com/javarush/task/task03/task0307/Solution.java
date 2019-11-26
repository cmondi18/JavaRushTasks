package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg0 = new Zerg();
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        zerg0.name = "z0";
        zerg1.name = "z1";
        zerg2.name = "z2";
        zerg3.name = "z3";
        zerg4.name = "z4";

        Protoss prot1 = new Protoss();
        prot1.name = "p1";
        Protoss prot2 = new Protoss();
        prot2.name = "p2";
        Protoss prot3 = new Protoss();
        prot3.name = "p3";

        Terran ter1 = new Terran();
        Terran ter2 = new Terran();
        Terran ter3 = new Terran();
        Terran ter4 = new Terran();
        ter1.name = "t1";
        ter2.name = "t2";
        ter3.name = "t3";
        ter4.name = "t4";
        //напишите тут ваш код
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
