package org.year_2024.may.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;

        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            setTop(left, right, list, matrix[top]);
            top++;

            setRight(matrix, top, bottom, list, right);
            right--;

            if (top <= bottom) {
                setBottom(right, left, list, matrix[bottom]);
                bottom--;
            }

            if (left <= right) {
                setLeft(matrix, bottom, top, list, left);
                left++;
            }
        }

        return list;
    }

    private static void setLeft(int[][] matrix, int bottom, int top, List<Integer> list, int left) {
        for (int i = bottom; i >= top; i--) {
            list.add(matrix[i][left]);
        }
    }

    private static void setBottom(int right, int left, List<Integer> list, int[] matrix) {
        for (int i = right; i >= left; i--) {
            list.add(matrix[i]);
        }
    }

    private static void setRight(int[][] matrix, int top, int bottom, List<Integer> list, int right) {
        for (int i = top; i <= bottom; i++) {
            list.add(matrix[i][right]);
        }
    }

    private static void setTop(int left, int right, List<Integer> list, int[] matrix) {
        for (int i = left; i <= right; i++) {
            list.add(matrix[i]);
        }
    }

}
