package org.year_2024.may.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyStringsTest {

    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of("6", "2", "3"),
                Arguments.of("56088", "123", "456"),
                Arguments.of("121932631112635269", "123456789", "987654321"),
                Arguments.of("419254329864656431168468", "498828660196", "840477629533")
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void multiply(String expected, String a, String b) {
        assertEquals(expected, MultiplyStrings.multiply(a, b));
    }
}