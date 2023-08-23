package easyPartTwo;

import org.junit.Test;

import java.util.List;

import static org.example.easyPartTwo.BinaryTreePreorderTraversal.convertArrToTreeNode;
import static org.example.easyPartTwo.BinaryTreePreorderTraversal.preorderTraversal;
import static org.junit.Assert.assertEquals;

public class BinaryTreePreorderTraversalTest {
    @Test
    public void test() {
        test(List.of(1, 2, 3), new Integer[]{1, null, 2, 3});
        test(List.of(1), new Integer[]{1});
        test(List.of(), new Integer[]{});
    }

    private void test(List<Integer> exp, Integer[] act) {
        assertEquals(exp, preorderTraversal(convertArrToTreeNode(act)));
    }
}
