package org.example.helpers.tree;

public class Tree {
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
