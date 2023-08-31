package org.example.year_2023.may.medium;

import java.util.Optional;

public class DeleteNodeInALinkedList {
    public static void deleteNode(ListNode node) {
        Optional.ofNullable(node)
                .ifPresent(x -> Optional.of(x)
                        .map(n -> n.next)
                        .ifPresentOrElse(y -> {
                            node.val = y.val;
                            node.next = node.next.next;
                        }, () -> node.next = null)
                );
    }

    public static void add(ListNode head, int val) {
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(val);
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
