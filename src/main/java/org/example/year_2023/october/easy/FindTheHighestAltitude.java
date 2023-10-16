package org.example.year_2023.october.easy;

public class FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;

        for (int j : gain) {
            max = Math.max(max, current += j);
        }
        return max;
    }
}
