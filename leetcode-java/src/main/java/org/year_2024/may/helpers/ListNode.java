package org.year_2024.may.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static List<Integer> listNodeToList(ListNode node) {
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list;
    }

    public static ListNode toListNode(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        ListNode head = new ListNode(nums[0]);
        ListNode current = head;

        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }

        return head;
    }

    public static ListNode toListNode(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) {
            return null;
        }

        ListNode head = new ListNode(nums.get(0));
        ListNode current = head;
        for (int i = 1; i < nums.size(); i++) {
            current.next = new ListNode(nums.get(i));
            current = current.next;
        }
        return head;
    }

    public static List<Integer> listNodesToList(List<Integer> a,
                                                List<Integer> b,
                                                BiFunction<ListNode, ListNode, ListNode> func) {
        return listNodeToList(func.apply(toListNode(a), toListNode(b)));
    }
}
