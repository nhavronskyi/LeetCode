package org.year_2024.june.medium;

import java.util.Arrays;

public class ProductsOfArrayDiscludingSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        Arrays.fill(result, 1);

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }

}
