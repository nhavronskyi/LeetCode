package org.example.easy;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedArrayToBinarySearchTree {
    public static int[] getBSTAsArray(TreeNode root) {
        var list = new ArrayList<Integer>();
        preorderTraversal(root, list);
        return list.stream().mapToInt(x -> x).toArray();
    }

    private static void preorderTraversal(TreeNode root, List<Integer> traversal) {
        if (root != null) {
            traversal.add(root.val);
            preorderTraversal(root.left, traversal);
            preorderTraversal(root.right, traversal);
        }
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private static TreeNode buildBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST(nums, start, mid - 1);
        root.right = buildBST(nums, mid + 1, end);
        return root;
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
