package org.year_2024.may.medium;

import org.year_2024.may.helpers.ListNode;

import java.util.Stack;

public class AddTwoNumbersII {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = listNodeToStack(l1);
        Stack<Integer> stack2 = listNodeToStack(l2);

        int carry = 0;
        ListNode head = null;

        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int sum = carry + getElem(stack1) + getElem(stack2);
            carry = sum / 10;

            head = new ListNode(sum % 10, head);
        }

        return head;
    }

    private static int getElem(Stack<Integer> stack) {
        return !stack.isEmpty() ? stack.pop() : 0;
    }

    private static Stack<Integer> listNodeToStack(ListNode node) {
        Stack<Integer> stack = new Stack<>();
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        return stack;
    }
}
