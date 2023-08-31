package org.example.july.db;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        if (head.val == head.next.val) {
            return deleteDuplicates(head.next);
        } else {
            head.next = deleteDuplicates(head.next);
            return head;
        }
    }

    public static ListNode convertArrToListNode(int[] arr) {
        ListNode first = new ListNode(0);
        ListNode curr = first;
        for (int i : arr) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return first.next;
    }

    public static int[] convertListNodeToArr(ListNode head) {
        return convertListNodeToArr(new LinkedList<>(), head).stream()
                .mapToInt(n -> n)
                .toArray();
    }

    private static List<Integer> convertListNodeToArr(List<Integer> list, ListNode head) {
        return Optional.ofNullable(head)
                .map(node -> {
                    list.add(node.val);
                    return convertListNodeToArr(list, node.next);
                })
                .orElse(list);
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        private ListNode(int val) {
            this.val = val;
        }
    }
}
