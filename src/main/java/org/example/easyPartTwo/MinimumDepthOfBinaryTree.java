package org.example.easyPartTwo;

import org.example.helpers.tree.TreeNode;

public class MinimumDepthOfBinaryTree {
    public static int minDepth(TreeNode root) {
        return root == null ? 0
                : root.left == null ? 1 + minDepth(root.right)
                : root.right == null ? 1 + minDepth(root.left)
                : Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static TreeNode convertArrToTreeNode(Integer[] values) {
        return convert(values, 0);
    }

    private static TreeNode convert(Integer[] values, int index) {
        if (index >= values.length || values[index] == null) {
            return null;
        }
        return new TreeNode(values[index], convert(values, index + 1), convert(values, index + 2));
    }
}
