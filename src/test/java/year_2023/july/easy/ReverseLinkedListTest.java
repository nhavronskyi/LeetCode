package year_2023.july.easy;

import org.example.year_2023.july.easy.ReverseLinkedList;
import org.example.year_2023.july.easy.ReverseLinkedList.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReverseLinkedListTest {
    private final ReverseLinkedList service = new ReverseLinkedList();

    private ArrayList<Integer> nodeToList(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (listNode != null) {
            arrayList.add(listNode.val);
            listNode = listNode.next;
        }
        return arrayList;
    }

    @Test
    public void test() {
        LinkedNode listNode = new LinkedNode();

        Integer[] test = new Integer[]{1, 2, 3, 4, 5};

        Stream.of(test).forEach(listNode::add);

        Assertions.assertEquals(List.of(5, 4, 3, 2, 1), nodeToList(service.reverseList(listNode.getHead())));
    }

    @Test
    public void test2() {
        LinkedNode listNode = new LinkedNode();

        Integer[] test = new Integer[]{1, 2};

        Stream.of(test).forEach(listNode::add);

        Assertions.assertEquals(List.of(2, 1), nodeToList(service.reverseList(listNode.getHead())));
    }

    @Test
    public void test3() {
        LinkedNode listNode = new LinkedNode();

        Integer[] test = new Integer[]{};

        Stream.of(test).forEach(listNode::add);

        Assertions.assertEquals(List.of(), nodeToList(service.reverseList(listNode.getHead())));
    }

    private static class LinkedNode {
        private ListNode head;
        private ListNode tail;

        public void add(int val) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public ListNode getHead() {
            return head;
        }
    }
}
