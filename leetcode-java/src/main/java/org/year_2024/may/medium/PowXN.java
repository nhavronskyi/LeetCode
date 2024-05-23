package org.year_2024.may.medium;

public class PowXN {
    public static double myPow(double x, int n) {
        double ans = 1;
        long num = n;
        if (num < 0) {
            num = -num;
        }
        while (num > 0) {
            if (num % 2 == 1) {
                ans *= x;
                num--;
            } else {
                x *= x;
                num /= 2;
            }
        }
        return n < 0 ? 1 / ans : ans;
    }
}
