package org.year_2024.may.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.year_2024.may.helpers.ListNode;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {


    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.arguments(List.of(7, 0, 8), new int[]{2, 4, 3}, new int[]{5, 6, 4}),
                Arguments.arguments(List.of(0), new int[]{0}, new int[]{0}),
                Arguments.arguments(List.of(8, 9, 9, 9, 0, 0, 0, 1), new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9}),
                Arguments.arguments(
                        List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
                        new int[]{9},
                        new int[]{1, 9, 9, 9, 9, 9, 9, 9, 9, 9}),
                Arguments.arguments(
                        List.of(6, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
                        new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        new int[]{5, 6, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void addTwoNumbers(List<Integer> expected, int[] a, int[] b) {
        var nodeA = ListNode.toListNode(a);
        var nodeB = ListNode.toListNode(b);
        var res = AddTwoNumbers.addTwoNumbers(nodeA, nodeB);

        assertEquals(expected, ListNode.listNodeToList(res));
    }
}