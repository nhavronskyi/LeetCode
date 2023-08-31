package org.example.year_2023.may.easy;

import org.example.helpers.tree.TreeNode;

public class MinimumDepthOfBinaryTree {
    public static int minDepth(TreeNode root) {
        return root == null ? 0
                : root.left == null ? 1 + minDepth(root.right)
                : root.right == null ? 1 + minDepth(root.left)
                : Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
