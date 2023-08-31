package year_2023.unsorted.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.example.year_2023.june.easy.BalancedBinaryTree.convertArrToTreeNode;
import static org.example.year_2023.june.easy.BalancedBinaryTree.isBalanced;

public class BalancedBinaryTreeTest {
    @Test
    public void correct() {
        correct(new Integer[]{3, 9, 20, null, null, 15, 7});
        correct(new Integer[]{});
    }

    private void correct(Integer[] act) {
        Assert.assertTrue(isBalanced(convertArrToTreeNode(act)));
    }

    @Test
    public void wrong() {
        wrong(new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4});
    }

    private void wrong(Integer[] act) {
        Assert.assertFalse(isBalanced(convertArrToTreeNode(act)));
    }
}
