package org.year_2024.may.medium;

public class MatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int[][] temp = copyArr(matrix);

        for (int i = 0; i < matrix.length; i++) {
            if (containsZeros(temp[i])) {
                setSides(matrix, temp, i);
            }
        }
    }

    private static boolean containsZeros(int[] matrix) {
        for (int j : matrix) {
            if (j == 0) {
                return true;
            }
        }
        return false;
    }

    private static void setSides(int[][] matrix, int[][] temp, int i) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (temp[i][j] == 0) {
                setVertical(matrix, j);
            }
            matrix[i][j] = 0;
        }
    }

    private static void setVertical(int[][] matrix, int j) {
        for (int k = 0; k < matrix.length; k++) {
            matrix[k][j] = 0;
        }
    }

    private static int[][] copyArr(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, temp[i], 0, matrix[i].length);
        }
        return temp;
    }
}
