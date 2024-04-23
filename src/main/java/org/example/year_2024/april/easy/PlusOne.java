package org.example.year_2024.april.easy;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int last = digits.length - 1; last >= 0; last--) {
            if (digits[last] < 9) {
                digits[last]++;
                return digits;
            }
            digits[last] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
