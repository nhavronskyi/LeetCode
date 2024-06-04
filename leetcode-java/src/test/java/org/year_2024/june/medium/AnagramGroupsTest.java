package org.year_2024.june.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramGroupsTest {

    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.arguments(
                        List.of(List.of("hat"), List.of("act", "cat"), List.of("stop", "pots", "tops")),
                        new String[]{"act", "pots", "tops", "cat", "stop", "hat"}),
                Arguments.arguments(List.of(List.of("x")), new String[]{"x"})
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void groupAnagrams(List<List<String>> result, String[] input) {
        var actual = AnagramGroups.groupAnagrams(input);
        assertEquals(sortAnswer(result), sortAnswer(actual));
    }

    private static List<List<String>> sortAnswer(List<List<String>> result) {
        return result.stream()
                .map(x -> x.stream()
                        .sorted()
                        .toList())
                .collect(Collectors.toSet())
                .stream().toList();
    }
}