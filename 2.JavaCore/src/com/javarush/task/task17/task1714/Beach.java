package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o) {
        return ((this.getQuality() - o.getQuality()) + (int)(10*(this.getDistance() - o.getDistance())));
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public synchronized static void main(String[] args) {
        /* Beach beach1 = new Beach("Perviy", 5, 10);
        Beach beach2 = new Beach("Vtoroy", 17, 44);
        Beach beach3 = new Beach("3", 3, 8);
        System.out.println(beach1.compareTo(beach2));
        System.out.println(beach2.compareTo(beach1));

        System.out.println(beach1.compareTo(beach3));
        System.out.println(beach3.compareTo(beach2));

        Beach a = new Beach("Затон", 7,9);
        Beach b = new Beach("Волга", 6,8);
        System.out.println(a.compareTo(b));
        Beach c = new Beach("Затон", 7,8);
        Beach d = new Beach("Волга", 6,9);
        System.out.println(c.compareTo(d)); */

    }
}
