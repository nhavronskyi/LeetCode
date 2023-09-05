package org.example.year_2023.september.easy;

public class ReverseBits {
    public static int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++, n >>= 1) {
            ans = ans << 1 | n & 1;
        }
        return ans;
    }

    public static int parseBinaryToInt(String binary) {
        return (int) Long.parseLong(binary, 2);
    }

    public static long convertReversedBitsToLong(int reversedBits) {
        return Long.parseLong(Integer.toBinaryString(reversedBits), 2);
    }
}
