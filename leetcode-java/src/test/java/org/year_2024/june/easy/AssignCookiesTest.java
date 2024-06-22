package org.year_2024.june.easy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class AssignCookiesTest {
    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.arguments(1, new int[]{1, 2, 3}, new int[]{1, 1}),
                Arguments.arguments(2, new int[]{1, 2}, new int[]{1, 2, 3}),
                Arguments.arguments(2, new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8}),
                Arguments.arguments(4, new int[]{10, 9, 8, 7, 10, 9, 8, 7}, new int[]{10, 9, 8, 7})
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    public void testFindContentChildren(int res, int[] g, int[] s) {
        Assertions.assertEquals(res, AssignCookies.findContentChildren(g, s));
    }
}