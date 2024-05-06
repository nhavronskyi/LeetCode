package org.year_2024.may.easy;

public class FindWinnerOnATicTacToeGame {
    public static String tictactoe(int[][] moves) {
        int[][] grid = new int[3][3];
        setPlayers(moves, grid);

        for (int i = 0; i < 3; i++) {
            if (winMoves(grid, i, i, i, 1)) {
                return "A";
            } else if (winMoves(grid, i, i, i, 2)) {
                return "B";
            }
        }

        return winMoves(grid, 0, 1, 2, 1) ? "A" :
                winMoves(grid, 0, 1, 2, 2) ? "B" :
                        moves.length < 9 ? "Pending" : "Draw";
    }

    private static boolean winMoves(int[][] grid, int x, int y, int z, int player) {
        return isAWinner(grid, x, y, z, player);
    }

    private static boolean isAWinner(int[][] grid, int x, int y, int z, int player) {
        return winOptionHorizontal(grid, x, y, z, player) ||
                winOptionVertical(grid, x, y, z, player);
    }

    private static boolean winOptionVertical(int[][] grid, int x, int y, int z, int player) {
        return player == grid[0][z] && player == grid[1][y] && player == grid[2][x];
    }

    private static boolean winOptionHorizontal(int[][] grid, int x, int y, int z, int player) {
        return player == grid[x][0] && player == grid[y][1] && player == grid[z][2];
    }

    private static void setPlayers(int[][] moves, int[][] grid) {
        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];

            grid[row][col] = i % 2 == 0 ? 1 : 2;
        }
    }
}
