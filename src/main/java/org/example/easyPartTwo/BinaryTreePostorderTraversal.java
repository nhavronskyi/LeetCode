package org.example.easyPartTwo;

import org.example.helpers.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class BinaryTreePostorderTraversal {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        postorderTraversal(root, list);
        return list;
    }

    private static void postorderTraversal(TreeNode root, List<Integer> list) {
        Optional.ofNullable(root)
                .ifPresent(x -> {
                    postorderTraversal(x.left, list);
                    postorderTraversal(x.right, list);
                    list.add(x.val);
                });
    }
}
