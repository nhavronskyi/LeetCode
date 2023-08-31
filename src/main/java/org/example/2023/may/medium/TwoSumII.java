package org.example.may.medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int temp = target - numbers[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}
