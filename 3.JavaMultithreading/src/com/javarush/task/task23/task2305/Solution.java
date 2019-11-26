package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {

        Solution[] solutions = new Solution[2];
        Solution sol1 = new Solution();
        sol1.innerClasses[0] = new Solution().new InnerClass();
        sol1.innerClasses[1] = new Solution().new InnerClass();
        solutions[0] = sol1;
        Solution sol2 = new Solution();
        sol2.innerClasses[0] = new Solution().new InnerClass();
        sol2.innerClasses[1] = new Solution().new InnerClass();
        solutions[1] = sol2;
        return solutions;
    }

    public static void main(String[] args) {

    }
}
