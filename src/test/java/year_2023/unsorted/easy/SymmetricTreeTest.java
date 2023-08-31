package year_2023.unsorted.easy;

import org.example.year_2023.july.easy.SymmetricTree;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.example.year_2023.july.easy.SymmetricTree.*;

public class SymmetricTreeTest {

    @Test
    public void trueTest() {
//        // [1,2,2,3,4,4,3]
        SymmetricTree.TreeNode root = new SymmetricTree.TreeNode(1);
        Integer[] nums = {2, 2, 3, 4, 4, 3};
        Arrays.stream(nums).forEach(x -> insert(root, x));

        showTree(root);


        Assert.assertTrue(isSymmetric(root));
    }

    @Test
    public void falseTest() {
        // [1,2,2,null,3,null,3]
        SymmetricTree.TreeNode root = new SymmetricTree.TreeNode(1);
        Integer[] nums = {2, 2, null, 3, null, 3};
        Arrays.stream(nums).forEach(x -> insert(root, x));
        showTree(root);
        Assert.assertFalse(isSymmetric(root));
    }
}
