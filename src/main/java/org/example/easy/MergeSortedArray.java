package org.example.easy;


public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0,nums1, m, n);

        for (int i = 1; i < nums1.length; i++) {
            int key = nums1[i];
            int j = i - 1;

            while (j >= 0 && nums1[j] > key) {
                nums1[j + 1] = nums1[j];
                j = j - 1;
            }
            nums1[j + 1] = key;
        }
    }
}
