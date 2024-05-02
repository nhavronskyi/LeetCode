package org.year_2024.may.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BaseballGameTest {

    @ParameterizedTest
    @MethodSource("args")
    void calPointsTest(String[] operations, int expected) {
        Assertions.assertEquals(expected, BaseballGame.calPoints(operations));
    }

    Stream<Arguments> args() {
        return Stream.of(
                arguments(new String[]{"5", "2", "C", "D", "+"}, 30),
                arguments(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}, 27),
                arguments(new String[]{"1", "C"}, 0)
        );
    }

}