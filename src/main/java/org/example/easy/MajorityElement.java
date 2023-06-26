package org.example.easy;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ans = nums[0];
        int count = 1;

        for (int num : nums) {
            count += num == ans ? 1 : -1;

            if (count == 0) {
                ans = num;
                count = 1;
            }
        }

        return ans;
    }
}