package org.year_2024.may.easy;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindWinnerOnATicTacToeGameTest {
    @ParameterizedTest
    @MethodSource("args")
    void testIfPlayerWins(String expected, int[][] moves) {
        assertEquals(expected, FindWinnerOnATicTacToeGame.tictactoe(moves));
    }

    Stream<Arguments> args() {
        return Stream.of(
                Arguments.of("A", new int[][]{{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}}),
                Arguments.of("B", new int[][]{{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}}),
                Arguments.of("Draw", new int[][]{{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}}),
                Arguments.of("Pending", new int[][]{{0, 0}, {1, 1}})
        );
    }
}