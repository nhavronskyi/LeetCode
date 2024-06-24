package org.year_2024.june.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CheckIfTwoStringArraysAreEquivalentTest {

    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.arguments(true, new String[]{"ab", "c"}, new String[]{"a", "bc"}),
                Arguments.arguments(true, new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}),
                Arguments.arguments(false, new String[]{"a", "cb"}, new String[]{"ab", "c"})
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void arrayStringsAreEqual(boolean result, String[] a, String[] b) {
        Assertions.assertEquals(result, CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(a, b));
    }
}