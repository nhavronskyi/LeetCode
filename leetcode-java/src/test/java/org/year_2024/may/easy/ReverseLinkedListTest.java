package org.year_2024.may.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.year_2024.may.helpers.ListNode;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedListTest {

    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(List.of(5, 4, 3, 2, 1), new int[]{1, 2, 3, 4, 5}),
                Arguments.of(List.of(2, 1), new int[]{1, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void reverseList(List<Integer> expected, int[] act) {
        var node = ListNode.toListNode(act);

        var list = ListNode.listNodeToList(ReverseLinkedList.reverseList(node));
        assertEquals(expected, list);
    }
}