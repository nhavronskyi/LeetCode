package org.year_2024.june.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TwoIntegerSumTest {

    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.arguments(List.of(0, 1), new int[]{3, 4, 5, 6}, 7),
                Arguments.arguments(List.of(0, 1), new int[]{3, 4, 5, 6}, 7),
                Arguments.arguments(List.of(0, 1), new int[]{5, 5}, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    public void test(List<Integer> exp, int[] input, int target) {
        int[] res = TwoIntegerSum.twoSum(input, target);
        assertNotNull(res);

        var array = Arrays.stream(res).boxed().toList();
        assertEquals(exp, array);
    }
}