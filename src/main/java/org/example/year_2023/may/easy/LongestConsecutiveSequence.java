package org.example.year_2023.may.easy;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = 1;
        int curr = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    curr++;
                } else {
                    max = Math.max(max, curr);
                    curr = 1;
                }
            }
        }
        return Math.max(max, curr);
    }
}
