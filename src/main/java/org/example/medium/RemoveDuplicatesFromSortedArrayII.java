package org.example.medium;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int i = 2;
        for (int j = i; j < nums.length; j++) {
            if (nums[j] != nums[i-2]) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
