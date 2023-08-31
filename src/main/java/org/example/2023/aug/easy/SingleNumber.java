package org.example.aug.easy;

import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        return Arrays.stream(nums)
                .filter(i -> Arrays.stream(nums)
                        .filter(num -> num == i)
                        .count() == 1L)
                .findFirst()
                .orElseThrow(ArithmeticException::new);
    }
}
