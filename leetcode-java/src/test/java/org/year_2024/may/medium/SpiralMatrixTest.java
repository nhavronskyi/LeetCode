package org.year_2024.may.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SpiralMatrixTest {

    public static Stream<Arguments> args() {
        return Stream.of(
                arguments(
                        List.of(1, 2, 3, 6, 9, 8, 7, 4, 5),
                        new int[][]{
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}}
                ),
                arguments(
                        List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7),
                        new int[][]{
                                {1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10, 11, 12}}
                )

        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void spiralMatrixTest(List<Integer> expected, int[][] matrix) {
        assertEquals(expected, SpiralMatrix.spiralOrder(matrix));
    }
}