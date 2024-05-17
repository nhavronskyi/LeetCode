package org.year_2024.may.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class LargestPerimeterTriangleTest {

    public static Stream<Arguments> args() {
        return Stream.of(
                of(5, new int[]{2, 1, 2}),
                of(0, new int[]{1, 1, 2}),
                of(0, new int[]{1, 2, 1, 10}),
                of(8, new int[]{3, 6, 2, 3}),
                of(15, new int[]{2, 6, 2, 5, 4, 15, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void largestPerimeter(int expected, int[] nums) {
        assertEquals(expected, LargestPerimeterTriangle.largestPerimeter(nums));
    }
}