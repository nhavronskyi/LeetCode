package org.year_2024.may.easy;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MatrixDiagonalSumTest {

    @ParameterizedTest
    @MethodSource("args")
    void shouldReturnDiagonalSum(int expected, int[][] matrix) {
        assertEquals(expected, MatrixDiagonalSum.diagonalSum(matrix));
    }

    Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(25, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
                Arguments.of(8, new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}),
                Arguments.of(5, new int[][]{{5}}),
                Arguments.of(55, new int[][]{{7, 3, 1, 9}, {3, 4, 6, 9}, {6, 9, 6, 6}, {9, 5, 8, 5}})
        );
    }
}