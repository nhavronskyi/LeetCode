package org.year_2024.may.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class IsAnagramTest {

    public static Stream<Arguments> trueArgs() {
        return Stream.of(
                Arguments.arguments("racecar", "carrace")
        );
    }

    public static Stream<Arguments> falseArgs() {
        return Stream.of(
                Arguments.arguments("jar", "jam")
        );
    }

    @ParameterizedTest()
    @MethodSource("trueArgs")
    @DisplayName("is Anagram")
    void isAnagram(String s, String t) {
        Assertions.assertTrue(IsAnagram.isAnagram(s, t), "%s contains %s".formatted(s, t));
    }

    @ParameterizedTest()
    @MethodSource("falseArgs")
    @DisplayName("is not Anagram")
    void isNotAnagram(String s, String t) {
        Assertions.assertFalse(IsAnagram.isAnagram(s, t), "%s not contains %s".formatted(s, t));
    }

}