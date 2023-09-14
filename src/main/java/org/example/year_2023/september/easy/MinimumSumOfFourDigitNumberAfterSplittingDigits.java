package org.example.year_2023.september.easy;

import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public static int minimumSum(int num) {
        int[] arr = new int[4];

        for (int i = 0; num > 0; i++) {
            arr[i] = num % 10;
            num /= 10;
        }

        Arrays.sort(arr);

        int a = arr[0] * 10 + arr[2];
        int b = arr[1] * 10 + arr[3];
        return a + b;
    }
}
