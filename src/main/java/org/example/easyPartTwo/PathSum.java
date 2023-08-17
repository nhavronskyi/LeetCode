package org.example.easyPartTwo;

import org.example.helpers.TreeNode;

public class PathSum {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.right == null && root.left == null) {
            return root.val == targetSum;
        }
        int newSum = targetSum - root.val;
        return hasPathSum(root.left, newSum) || hasPathSum(root.right, newSum);
    }


    public static TreeNode convertArrToTreeNode(Integer[] values) {
        return convert(values, 0);
    }

    private static TreeNode convert(Integer[] values, int index) {
        if (index >= values.length || values[index] == null) {
            return null;
        }
        return new TreeNode(values[index], convert(values, 2 * index + 1), convert(values, 2 * index + 2));
    }
}
