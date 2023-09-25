package org.example.year_2023.september.easy;

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public static int[] leftRightDifference(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();

        for (int i = 0, leftSum = 0; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = Math.abs(leftSum - (totalSum - leftSum - nums[i]));

            leftSum += temp;
        }

        return nums;
    }
}
