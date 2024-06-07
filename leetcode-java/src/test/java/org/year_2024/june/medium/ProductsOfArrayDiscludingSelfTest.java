package org.year_2024.june.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductsOfArrayDiscludingSelfTest {

    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.arguments(List.of(48, 24, 12, 8), new int[]{1, 2, 4, 6}),
                Arguments.arguments(List.of(0, -6, 0, 0, 0), new int[]{-1, 0, 1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void test(List<Integer> expected, int[] actual) {
        var act = Arrays.stream(ProductsOfArrayDiscludingSelf.productExceptSelf(actual))
                .boxed()
                .toList();

        assertEquals(expected, act);
    }
}