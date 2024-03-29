package org.example.year_2023.july.medium;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 1, iterator = 1; i >= 0; i--) {
            ans[i] *= iterator;
            iterator *= nums[i];
        }
        return ans;
    }
}
