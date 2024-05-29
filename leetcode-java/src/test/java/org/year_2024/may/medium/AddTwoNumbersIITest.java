package org.year_2024.may.medium;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.year_2024.may.helpers.ListNode;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AddTwoNumbersIITest {

    private Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(List.of(7, 8, 0, 7), getActual(List.of(7, 2, 4, 3), List.of(5, 6, 4))),
                Arguments.of(List.of(8, 0, 7), getActual(List.of(2, 4, 3), List.of(5, 6, 4))),
                Arguments.of(List.of(0), getActual(List.of(0), List.of(0)))
        );
    }

    private List<Integer> getActual(List<Integer> a, List<Integer> b) {
        return ListNode.listNodesToList(a, b, AddTwoNumbersII::addTwoNumbers);
    }

    @ParameterizedTest
    @MethodSource("args")
    void addTwoNumbers(List<Integer> expected, List<Integer> actual) {
        assertEquals(expected, actual);
    }
}