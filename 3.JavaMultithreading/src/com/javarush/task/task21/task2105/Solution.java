package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Исправить ошибку. Сравнение объектов
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        if (!(o instanceof Solution)) return false;
        Solution obj = (Solution) o;
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
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
