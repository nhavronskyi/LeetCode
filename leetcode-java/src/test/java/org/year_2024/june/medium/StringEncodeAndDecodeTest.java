package org.year_2024.june.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringEncodeAndDecodeTest {

    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.arguments(List.of("neet", "code", "love", "you")),
                Arguments.arguments(List.of("we", "say", ":", "yes")),
                Arguments.arguments(List.of()),
                Arguments.arguments(List.of("")),
                Arguments.arguments(List.of("The quick brown fox", "jumps over the", "lazy dog", "1234567890", "abcdefghijklmnopqrstuvwxyz"))
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    public void test(List<String> list) {
        var act = StringEncodeAndDecode.decode(StringEncodeAndDecode.encode(list));

        assertEquals(list, act);
    }
}