package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        System.out.println(hen.getDescription());
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            if (country == "Ukraine") return new UkrainianHen();
            else if (country == "Russia") return new RussianHen();
            else if (country == "Moldova") return new MoldovanHen();
            else if (country == "Belarus") return new BelarusianHen();
            else return null;
        }
    }

    // КЛАСС HEN можно implements от Country, тогда будет необходимо писать просто название страны БОЛЬШИМИ БУКВАМИ, без указателя Country.NAME
}
