package org.year_2024.may.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.year_2024.may.helpers.ListNode;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.year_2024.may.easy.MergeTwoSortedLists.mergeTwoLists;
import static org.year_2024.may.helpers.ListNode.listNodeToList;
import static org.year_2024.may.helpers.ListNode.toListNode;

class MergeTwoSortedListsTest {


    public static Stream<Arguments> args() {
        return Stream.of(
                arguments(List.of(1, 1, 2, 3, 4, 4), new int[]{1, 2, 4}, new int[]{1, 3, 4}),
                arguments(List.of(), new int[]{}, new int[]{}),
                arguments(List.of(0), new int[]{}, new int[]{0})
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void test(List<Integer> expected, int[] list1, int[] list2) {
        var nodeList1 = toListNode(list1);
        var nodeList2 = toListNode(list2);

        ListNode listNodeActual = mergeTwoLists(nodeList1, nodeList2);

        assertEquals(expected, listNodeToList(listNodeActual));
    }
}