package org.year_2024.may.easy;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                .map(RichestCustomerWealth::getSumArr)
                .max(Integer::compare)
                .orElse(-1);
    }

    private static int getSumArr(int[] account) {
        return Arrays.stream(account)
                .sum();
    }
}
