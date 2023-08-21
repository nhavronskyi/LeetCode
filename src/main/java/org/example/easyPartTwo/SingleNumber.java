package org.example.easyPartTwo;

import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        return Arrays.stream(nums)
                .filter(i -> Arrays.stream(nums)
                        .filter(num -> num == i)
                        .count() == 1L)
                .findFirst()
                .orElseThrow(ArithmeticException::new);
    }
//    public static int singleNumber(int[] nums) {
//        return Arrays.stream(nums)
//                .boxed()
//                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(x -> x.getValue() == 1)
//                .map(Map.Entry::getKey)
//                .findFirst()
//                .orElseThrow(ArithmeticException::new);
//    }
}
