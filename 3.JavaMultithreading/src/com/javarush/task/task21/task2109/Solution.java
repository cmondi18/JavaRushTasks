package com.javarush.task.task21.task2109;

import java.util.Objects;

/*
Запретить клонирование
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            A a = (A) o;
            return i == a.i &&
                    j == a.j;
        }

        @Override
        public int hashCode() {

            return Objects.hash(i, j);
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Object clone() throws CloneNotSupportedException{
            throw new CloneNotSupportedException("CAN NOT CLONE");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            B b = (B) o;
            return Objects.equals(name, b.name);
        }

        @Override
        public int hashCode() {

            return Objects.hash(super.hashCode(), name);
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        public Object clone() {
            return new C(getI(), getJ(), getName());
        }


    }


    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B(5, 7, "H");
        B clone = (B) b.clone();

        C c = new C(5, 12, "BR");
        C clone2 = (C) c.clone();

    }
}
