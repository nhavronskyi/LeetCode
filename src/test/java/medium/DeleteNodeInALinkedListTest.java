package medium;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static medium.DeleteNodeInALinkedList.*;

class DeleteNodeInALinkedListTest {

    @Test
    public void deleteMiddleNode5() {
        deleteTest(new int[]{4, 5, 1, 9}, new int[]{4, 1, 9}, 5);
    }

    @Test
    public void deleteMiddleNode1() {
        deleteTest(new int[]{4, 5, 1, 9}, new int[]{4, 5, 9}, 1);
    }

    @Test
    public void deleteLeftNode4() {
        deleteTest(new int[]{4, 5, 1, 9}, new int[]{5, 1, 9}, 4);
    }

    @Test
    public void deleteRightNode9() {
        deleteTest(new int[]{4, 5, 1, 9}, new int[]{4, 5, 1}, 9);
    }

    private void deleteTest(int[] nums, int[] expected, int elemToDelete) {
        ListNode head = new ListNode(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            add(head, nums[i]);
        }

        deleteNode(findNodeToDelete(head, elemToDelete));

        var current = head;
        for (int x : expected) {
            Assertions.assertEquals(x, current.val);
            current = current.next;
        }
    }

    private ListNode findNodeToDelete(ListNode node, int elemToDelete) {
        return node == null || node.val == elemToDelete ? node : findNodeToDelete(node.next, elemToDelete);
    }
}