package org.example.july.db;

public class SameTree {

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void insert(Integer element) {
        if (root == null) {
            root = new TreeNode(element);
        } else {
            insetHelper(root, element);
        }
    }

    private boolean insetHelper(TreeNode subTreeRoot, int element) {
        if (subTreeRoot.left == null) {
            return leftInsert(subTreeRoot, element);
        }
        return rightInsert(subTreeRoot, element);
    }

    private boolean leftInsert(TreeNode node, int element) {
        if (node.left != null) {
            return insetHelper(node.left, element);
        } else {
            node.left = new TreeNode(element);
            return true;
        }
    }

    private boolean rightInsert(TreeNode node, int element) {
        if (node.right != null) {
            return insetHelper(node.right, element);
        } else {
            node.right = new TreeNode(element);
            return true;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        return (p != null && q != null)
                && (p.val == q.val)
                && isSameTree(p.right, q.right)
                && isSameTree(p.left, q.left);
    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
