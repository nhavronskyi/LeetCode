package org.example.easyPartTwo;

import org.example.helpers.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class BinaryTreePreorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        preorderTraversal(root, list);
        return list;
    }

    private static void preorderTraversal(TreeNode root, List<Integer> list) {
        Optional.ofNullable(root)
                .ifPresent(node -> {
                    list.add(node.val);
                    preorderTraversal(node.left, list);
                    preorderTraversal(node.right, list);
                });
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
