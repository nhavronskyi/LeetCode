package org.example.june.easy;

import java.util.Arrays;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] answer = Arrays.copyOf(nums, nums.length * 2);
        System.arraycopy(nums, 0, answer, answer.length / 2, nums.length);
        return answer;
    }
}
