package org.example.helpers.list;

public class List {
    public static ListNode convertToListNode(int[] arr, boolean withChain) {
        ListNode first = new ListNode(0);
        ListNode current = first;

        for (int i : arr) {
            current.next = new ListNode(i);
            current = current.next;
        }

        if (withChain) {
            current.next = first;
        }

        return first.next;
    }
}
