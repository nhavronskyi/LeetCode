package org.example.easyPartTwo;

import java.util.Optional;

public class BalancedBinaryTree {
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

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

    public static TreeNode convertArrToTreeNode(Integer[] values, int index) {
        if (index >= values.length || values[index] == null) {
            return null;
        }

        TreeNode root = new TreeNode(values[index]);
        root.left = convertArrToTreeNode(values, 2 * index + 1);
        root.right = convertArrToTreeNode(values, 2 * index + 2);

        return root;
    }
}
