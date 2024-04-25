package org.year_2024.april.easy;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int sSum = s.chars().sum();
        int tSum = t.chars().sum();
        return (char) (tSum - sSum);
    }
}
