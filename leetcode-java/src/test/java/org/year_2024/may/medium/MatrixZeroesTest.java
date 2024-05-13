package org.year_2024.may.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class MatrixZeroesTest {
    public static Stream<Arguments> args() {
        return Stream.of(
                of(
                        new int[][]{{0, 0}},
                        new int[][]{{1, 0}}),
                of(
                        new int[][]{
                                {0, 1},
                                {0, 0},},
                        new int[][]{
                                {1, 1},
                                {0, 1}
                        }),
                of(
                        new int[][]{
                                {1, 0},
                                {0, 0},},
                        new int[][]{
                                {1, 1},
                                {1, 0}
                        }),
                of(
                        new int[][]{
                                {1, 0, 1},
                                {0, 0, 0},
                                {1, 0, 1}},
                        new int[][]{
                                {1, 1, 1},
                                {1, 0, 1},
                                {1, 1, 1}}),
                of(
                        new int[][]{
                                {0, 0, 0, 0},
                                {0, 4, 5, 0},
                                {0, 3, 1, 0}
                        },
                        new int[][]{
                                {0, 1, 2, 0},
                                {3, 4, 5, 2},
                                {1, 3, 1, 5}})
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void testZeroes(int[][] expected, int[][] matrix) {
        MatrixZeroes.setZeroes(matrix);
        for (int i = 0; i < expected.length; i++) {
            String expArray = getArray(expected, i);
            String matArray = getArray(matrix, i);
            assertArrayEquals(expected[i], matrix[i], "row " + i + " " + expArray + " == " + matArray);
        }
    }

    private static String getArray(int[][] arr, int ind) {
        return Arrays.stream(arr[ind])
                .boxed()
                .toList()
                .toString();
    }

}