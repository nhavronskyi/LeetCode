package org.example.easy;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class SymmetricTree {
    public static void insert(TreeNode root, Integer value) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left == null) {
                node.left = new TreeNode(value);
                break;
            } else {
                queue.offer(node.left);
            }

            if (node.right == null) {
                node.right = new TreeNode(value);
                break;
            } else {
                queue.offer(node.right);
            }
        }
    }

    public static void showTree(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.print(treeNode.val + " ");
        showTree(treeNode.left);
        showTree(treeNode.right);
    }

    public static boolean isSymmetric(TreeNode n) {
        return n == null || isSymmetricHelper(n.left, n.right);
    }

    private static boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null || !Objects.equals(left.val, right.val)) {
            return false;
        }

        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }

    public static class TreeNode {
        public Integer val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(Integer val) {
            this.val = val;
        }
    }
}
