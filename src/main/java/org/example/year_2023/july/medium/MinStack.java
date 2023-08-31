package org.example.year_2023.july.medium;

import java.util.EmptyStackException;

public class MinStack {
    private Node head;

    public MinStack() {

    }

    public void push(int val) {
        var newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        if (head == null) {
            throw new EmptyStackException();
        }
        return getMinHelper(head.val, head);
    }

    private int getMinHelper(int min, Node head) {
        return head == null ? min :
                getMinHelper(Math.min(min, head.val), head.next);
    }

    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
