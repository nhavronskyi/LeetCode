package org.year_2024.june.medium;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKElementsInList {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Long> res = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        return res.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
