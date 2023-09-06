package org.example.year_2023.september.easy;

public class NumberOf1Bits {
    public static int hammingWeight(int n) {
        int sum = 0;
        for (int i = 0; i < 32; i++, n >>= 1) {
            sum += n & 1;
        }
        return sum;
    }

    public static int convertBinaryToInt(String binaryCode) {
        return (int) Long.parseLong(binaryCode, 2);
    }
}
