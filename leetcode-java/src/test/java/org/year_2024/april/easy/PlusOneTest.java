package org.year_2024.april.easy;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PlusOneTest {

    @ParameterizedTest
    @MethodSource("test")
    void test(int[] expected, int[] actual) {
        assertArrayEquals(expected, PlusOne.plusOne(actual));
    }

    Stream<Arguments> test() {
        return Stream.of(
                arguments(new int[]{1, 2, 4}, new int[]{1, 2, 3}),
                arguments(new int[]{4, 3, 2, 2}, new int[]{4, 3, 2, 1}),
                arguments(new int[]{1, 3, 0}, new int[]{1, 2, 9}),
                arguments(new int[]{2, 0, 0}, new int[]{1, 9, 9}),
                arguments(new int[]{1, 0}, new int[]{9}),
                arguments(new int[]{1, 0, 0}, new int[]{9, 9})
        );
    }
}