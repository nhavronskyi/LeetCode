package org.example.easyPartTwo;

import org.example.helpers.tree.TreeNode;

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
}
