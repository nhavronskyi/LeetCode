package org.year_2024.may.easy;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RichestCustomerWealthTest {
    @ParameterizedTest
    @MethodSource("args")
    void findRichestWealth(int expected, int[][] accounts) {
        assertEquals(expected, RichestCustomerWealth.maximumWealth(accounts));
    }

    Stream<Arguments> args() {
        return Stream.of(
                arguments(6, new int[][]{{1, 2, 3}, {3, 2, 1}}),
                arguments(10, new int[][]{{1, 5}, {7, 3}, {3, 5}}),
                arguments(17, new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}})
        );
    }
}