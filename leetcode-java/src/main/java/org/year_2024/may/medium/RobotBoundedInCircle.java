package org.year_2024.may.medium;

public class RobotBoundedInCircle {
    public static boolean isRobotBounded(String instructions) {
        int[] steps = new int[2];
        int direction = 0;

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for (char ch : instructions.toCharArray()) {
            if (ch == 'G') {
                steps[0] += directions[direction][0];
                steps[1] += directions[direction][1];
            } else {
                direction = getDirection(ch, direction);
            }
        }

        return (steps[0] == 0 && steps[1] == 0) || direction != 0;
    }

    private static int getDirection(char ch, int direction) {
        return switch (ch) {
            case 'L' -> (direction + 1) % 4;
            case 'R' -> (direction + 3) % 4;
            default -> throw new IllegalStateException("Unexpected value: " + ch);
        };
    }
}
