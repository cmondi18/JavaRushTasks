package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object n) {
        if (n == this) return true;
        if (n == null || n.getClass() != this.getClass()) return false;
        if (!(n instanceof Solution)) return false;
        Solution obj = (Solution) n;
        if (this.first == null && obj.first == null && this.last == null && obj.last == null) return true;
        if (this.first == null && obj.first == null && this.last == obj.last) return true;
        if (this.first == obj.first && this.last == null && obj.last == null) return true;
        if (this.first == obj.first && this.last == obj.last) return true;
        return false;
    }

    @Override
    public int hashCode() {
        if (first == null && last != null) return 31 * last.hashCode();
        if (first != null && last == null) return 31 * first.hashCode();
        if (first == null && last == null) return 0;
        return 31 * first.hashCode() + last.hashCode();
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        s.add(new Solution("Donald", null));
        s.add(new Solution(null, "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
        System.out.println(s.contains(new Solution("Donald", null)));
        System.out.println(s.contains(new Solution(null, "Duck")));
    }
}
