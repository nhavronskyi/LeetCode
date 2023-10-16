package org.example.year_2023.october.easy;

import java.util.Arrays;

public class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
        double sum = Arrays.stream(nums)
                .limit(k)
                .sum();

        double maxAvg = sum / k;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxAvg = Math.max(maxAvg, sum / k);
        }

        return maxAvg;
    }
}
