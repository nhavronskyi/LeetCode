package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.example.may.easy.MinimumDepthOfBinaryTree.minDepth;
import static org.example.helpers.tree.Tree.*;

public class MinimumDepthOfBinaryTreeTest {

    @Test
    public void test() {
        helper(2, new Integer[]{3, 9, 20, null, null, 15, 7});
        helper(5, new Integer[]{2, null, 3, null, 4, null, 5, null, 6});
    }

    private void helper(int exp, Integer[] act) {
        Assert.assertEquals(exp, minDepth(convertArrToTreeNode(act)));
    }
}
