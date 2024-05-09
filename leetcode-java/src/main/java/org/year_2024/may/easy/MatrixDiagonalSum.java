package org.year_2024.may.easy;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int len = mat.length;
        int res = 0;

        for (int i = 0; i < len; i++) {
            int left = mat[i][i];
            int right = mat[i][len - i - 1];
            res += left + right;
        }

        return len % 2 == 0 ? res : res - mat[len / 2][len / 2];
    }
}
