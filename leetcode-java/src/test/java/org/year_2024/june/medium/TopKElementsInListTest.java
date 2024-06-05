package org.year_2024.june.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TopKElementsInListTest {

    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.arguments(List.of(2, 3), new int[]{1, 2, 2, 3, 3, 3}, 2),
                Arguments.arguments(List.of(7), new int[]{7}, 1),
                Arguments.arguments(List.of(1), new int[]{1, 2, 3, 1, 1, 1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void topKFrequent(List<Integer> expected, int[] input, int k) {
        int[] actual = TopKElementsInList.topKFrequent(input, k);
        List<Integer> act = Arrays.stream(actual).boxed().toList();
        assertEquals(sortRes(expected), sortRes(act));
    }

    private List<Integer> sortRes(List<Integer> input) {
        return input.stream()
                .sorted()
                .toList();
    }
}