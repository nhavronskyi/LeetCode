package org.example.easy;

public class ReverseLinkedList {
    public static class ListNode {
      public int val;
      public ListNode next;
      public ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    private ListNode list;

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        list = new ListNode(head.val);
        head = head.next;

        while(head != null){
            add(head.val);
            head = head.next;
        }

        return list;
    }

    private void add(int val) {
        ListNode newNode = new ListNode(val);
        if (list != null) {
            newNode.next = list;
        }
        list = newNode;
    }
}
