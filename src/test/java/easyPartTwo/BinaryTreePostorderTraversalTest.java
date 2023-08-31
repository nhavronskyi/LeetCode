package easyPartTwo;


import org.example.helpers.tree.Tree;
import org.junit.Test;

import java.util.List;

import static org.example.easyPartTwo.BinaryTreePostorderTraversal.postorderTraversal;
import static org.junit.Assert.assertEquals;

public class BinaryTreePostorderTraversalTest {
    @Test
    public void test() {
        test(List.of(3, 2, 1), new Integer[]{1, null, 2, 3});
        test(List.of(1), new Integer[]{1});
        test(List.of(), new Integer[]{});
    }

    private void test(List<Integer> exp, Integer[] act) {
        assertEquals(exp, postorderTraversal(Tree.convertArrToTreeNode(act)));
    }
}
