package org.example.year_2023.june.easy;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int prev1 = 1;
        int prev2 = 2;
        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return n <= 1 ? n : prev2;
    }
}
