package org.example.easyPartTwo;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        for (int j : nums) {
            int counter = 0;
            for (int num : nums) {
                if (j == num) {
                    ++counter;
                }
            }
            if (counter == 1) {
                return j;
            }
        }

        throw new ArithmeticException();
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
