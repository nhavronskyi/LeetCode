package org.example.easy;

import java.util.Arrays;
public class BinarySearch {
    public int search(int[] nums, int target) {
        return Arrays.stream(nums)
                .boxed()
                .toList()
                .indexOf(target);
    }
}
