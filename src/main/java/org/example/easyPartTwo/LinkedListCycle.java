package org.example.easyPartTwo;

import org.example.helpers.ListNode;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

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