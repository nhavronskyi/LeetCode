package org.year_2024.may.easy;

public class LargestPerimeterTriangle {
    public static int largestPerimeter(int[] nums) {
        insertionSort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];

            if (canCreateTriangle(a, b, c)) {
                return a + b + c;
            }
        }

        return 0;
    }

    private static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > val) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = val;
        }
    }

    private static boolean canCreateTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
