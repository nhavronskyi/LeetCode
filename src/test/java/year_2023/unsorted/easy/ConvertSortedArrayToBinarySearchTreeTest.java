package year_2023.unsorted.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.example.year_2023.june.easy.ConvertSortedArrayToBinarySearchTree.*;

public class ConvertSortedArrayToBinarySearchTreeTest {
    @Test
    public void test1() {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode node = sortedArrayToBST(nums);
        Assert.assertArrayEquals(new int[]{0, -10, -3, 5, 9}, getBSTAsArray(node));
    }

    @Test
    public void test2() {
        int[] nums = {1, 3};
        TreeNode node = sortedArrayToBST(nums);
        Assert.assertArrayEquals(new int[]{1, 3}, getBSTAsArray(node));
    }
}
