package org.example.year_2023.may.easy;


public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        for (int i = nums1.length - 1; n >= 0; i--) {
            nums1[i] = m >= 0 && nums1[m] > nums2[n] ? nums1[m--]
                    : nums2[n--];
        }
    }
}
