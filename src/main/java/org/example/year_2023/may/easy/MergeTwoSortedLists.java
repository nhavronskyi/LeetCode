package org.example.year_2023.may.easy;

import java.util.Optional;

public class MergeTwoSortedLists {
    private ListNode head;
    private ListNode tail;

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            return list1.val < list2.val ? merge(list1, list2) : merge(list2, list1);
        }
        return Optional.ofNullable(list1).orElse(list2);
    }

    private static ListNode merge(ListNode smaller, ListNode larger) {
        smaller.next = mergeTwoLists(smaller.next, larger);
        return smaller;
    }

    public void add(int elem) {
        ListNode newNode = new ListNode(elem);
        Optional.ofNullable(head).ifPresentOrElse(h -> tail = tail.next = newNode, () -> head = tail = newNode);
    }

    public ListNode getHead() {
        return head;
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        private ListNode(int val) {
            this.val = val;
        }
    }
}
