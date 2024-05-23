package org.year_2024.may.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.text.DecimalFormat;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowXNTest {

    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.arguments(1024.0, 2.00000, 10),
                Arguments.arguments(9.26100, 2.10000, 3),
                Arguments.arguments(0.25000, 2.00000, -2),
                Arguments.arguments(1, 2.00000, 0),
                Arguments.arguments(0.00000, 2.00000, -2147483648),
                Arguments.arguments(1.00000, 1.00000, 2147483647),
                Arguments.arguments(1.00000, -1.00000, -2147483648),
                Arguments.arguments(1.00000, 1.00000, -2147483648),
                Arguments.arguments(0.99979, 1.0000000000001, -2147483648)
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void powTest(double expected, double a, int n) {
        DecimalFormat df = new DecimalFormat("#.#####");
        String expectedF = df.format(expected);
        String actualF = df.format(PowXN.myPow(a, n));

        assertEquals(expectedF, actualF);
    }
}