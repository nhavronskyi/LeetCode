package org.example.year_2023.october.easy;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int length = mat.length;
        for (int i = 0; i < length; i++) {
            sum += mat[i][i] + mat[i][length - i - 1];
        }
        return sum - length % 2 * mat[length / 2][length / 2];
    }
}