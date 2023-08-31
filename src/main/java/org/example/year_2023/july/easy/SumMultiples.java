package org.example.year_2023.july.easy;


// https://leetcode.com/problems/sum-multiples/
public class SumMultiples {
    public int sumOfMultiples(int n) {
        return sumHelper(0, n);
    }

    private int sumHelper(int sum, int n) {
        return (n < 3) ? sum : sumHelper(
                (n % 3 == 0 || n % 5 == 0 || n % 7 == 0) ? sum + n : sum,
                --n);
    }
}