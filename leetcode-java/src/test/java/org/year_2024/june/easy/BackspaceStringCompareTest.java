package org.year_2024.june.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackspaceStringCompareTest {

    public static Stream<Arguments> trueArgs() {
        return Stream.of(
                Arguments.arguments(true, "ab#c", "ab#c"),
                Arguments.arguments(true, "ab##", "c#d#"),
                Arguments.arguments(false, "a#c", "b"),
                Arguments.arguments(false, "bxj##tw", "bxj###tw"),
                Arguments.arguments(true, "y#fo##f", "y#f#o##f")
        );
    }

    @ParameterizedTest
    @MethodSource("trueArgs")
    void backspaceCompare(boolean exp, String s, String t) {
        assertEquals(exp, BackspaceStringCompare.backspaceCompare(s, t));
    }
}