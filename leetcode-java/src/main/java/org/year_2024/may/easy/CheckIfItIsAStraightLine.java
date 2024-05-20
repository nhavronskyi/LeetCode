package org.year_2024.may.easy;

public class CheckIfItIsAStraightLine {
    public static boolean checkStraightLine(int[][] coordinates) {
        int xDiff = coordinates[1][0] - coordinates[0][0];
        int yDiff = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < coordinates.length; i++) {
            int[] curr = coordinates[i];
            int[] prev = coordinates[i - 1];
            int currXDiff = curr[0] - prev[0];
            int currYDiff = curr[1] - prev[1];

            if (yDiff * currXDiff != xDiff * currYDiff) {
                return false;
            }
        }
        return true;
    }
}
