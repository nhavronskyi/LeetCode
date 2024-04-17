package org.example.year_2024.april.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.example.year_2024.april.easy.FindTheIndexOfTheFirstOccurrenceInAString.strStr;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    @ParameterizedTest
    @MethodSource(value = "args")
    void itWorksTest(String haystack, String needle, int expected) {
        Assertions.assertEquals(expected, strStr(haystack, needle));
    }

    Stream<Arguments> args() {
        return Stream.of(
                Arguments.arguments("sadbutsad", "sad", 0),
                Arguments.arguments("leetcode", "leeto", -1),
                Arguments.arguments("something__dasda_s_ss__", "das", 11),
                Arguments.arguments("a", "a", 0),
                Arguments.arguments("mississippi", "issip", 4),
                Arguments.arguments("aabaabbbaabbbbabaaab", "abaa", 1)
        );
    }

}