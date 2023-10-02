package org.example.year_2023.september.easy;

import java.util.Arrays;

public class DifferenceBetweenElementSumAndDigitSumAfAnArray {
    public static int differenceOfSum(int[] nums) {
        return Arrays.stream(nums).sum() - Arrays.stream(divideAllDigits(nums)).sum();
    }

    private static int[] divideAllDigits(int[] nums) {
        return Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .flatMap(s -> s.chars()
                        .boxed())
                .mapToInt(Character::getNumericValue)
                .toArray();
    }
}
