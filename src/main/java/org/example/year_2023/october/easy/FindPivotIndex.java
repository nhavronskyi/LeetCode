package org.example.year_2023.october.easy;

import java.util.Arrays;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
