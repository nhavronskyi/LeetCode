package org.example.year_2023.june.easy;

import org.example.helpers.tree.TreeNode;

import java.util.Optional;

public class BalancedBinaryTree {

    public static boolean isBalanced(TreeNode root) {
        return root == null
                || (Math.abs(height(root.left) - height(root.right)) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right));
    }

    private static int height(TreeNode node) {
        return Optional.ofNullable(node)
                .map(n -> 1 + Math.max(height(n.left), height(n.right)))
                .orElse(0);
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
