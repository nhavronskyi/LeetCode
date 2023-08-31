package org.example.year_2023.june.easy;

import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies)
                .max()
                .orElse(-1);

        return Arrays.stream(candies)
                .map(candy -> candy + extraCandies)
                .mapToObj(candy -> candy >= max)
                .toList();
    }
}
