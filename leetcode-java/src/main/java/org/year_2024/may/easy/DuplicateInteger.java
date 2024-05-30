package org.year_2024.may.easy;

import java.util.Arrays;

public class DuplicateInteger {
    public static boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums)
                       .distinct()
                       .toArray().length != nums.length;
    }
}
