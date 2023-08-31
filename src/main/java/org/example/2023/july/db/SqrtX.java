package org.example.july.db;

public class SqrtX {
    public static int mySqrt(int x) {
        return x == 0 || x == 1 ? x : sqrtHelper(x, 1, x);
    }

    private static int sqrtHelper(int input, int left, int right) {
        int mid = left + (right - left) / 2;

        return mid > input / mid ? sqrtHelper(input, left, --mid)
                : mid + 1 > input / (mid + 1) ? mid
                : sqrtHelper(input, ++mid, right);
    }
}
