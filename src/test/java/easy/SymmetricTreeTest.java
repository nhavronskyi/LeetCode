package easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.example.easy.SymmetricTree.*;

public class SymmetricTreeTest {

    @Test
    public void trueTest() {
//        // [1,2,2,3,4,4,3]
        TreeNode root = new TreeNode(1);
        Integer[] nums = {2, 2, 3, 4, 4, 3};
        Arrays.stream(nums).forEach(x -> insert(root, x));

        showTree(root);


        Assert.assertTrue(isSymmetric(root));
    }

    @Test
    public void falseTest() {
        // [1,2,2,null,3,null,3]
        TreeNode root = new TreeNode(1);
        Integer[] nums = {2, 2, null, 3, null, 3};
        Arrays.stream(nums).forEach(x -> insert(root, x));
        showTree(root);
        Assert.assertFalse(isSymmetric(root));
    }
}
