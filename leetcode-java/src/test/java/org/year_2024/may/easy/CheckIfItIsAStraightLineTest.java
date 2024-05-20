package org.year_2024.may.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.year_2024.may.easy.CheckIfItIsAStraightLine.checkStraightLine;

class CheckIfItIsAStraightLineTest {

    public static Stream<Arguments> trueArgs() {
        return Stream.of(
                Arguments.arguments((Object) new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}),
                Arguments.arguments((Object) new int[][]{{0, 0}, {0, 1}, {0, -1}})
        );
    }

    public static Stream<Arguments> falseArgs() {
        return Stream.of(
                Arguments.arguments((Object) new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}})
        );
    }

    @ParameterizedTest
    @MethodSource("trueArgs")
    void checkIfStraightLine(int[][] args) {
        assertTrue(checkStraightLine(args));
    }

    @ParameterizedTest
    @MethodSource("falseArgs")
    void checkIfNotStraightLine(int[][] args) {
        assertFalse(checkStraightLine(args));
    }

}