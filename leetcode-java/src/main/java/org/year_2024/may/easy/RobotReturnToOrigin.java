package org.year_2024.may.easy;

public class RobotReturnToOrigin {
    public static boolean judgeCircle(String moves) {
        var arr = new int[2];
        moves.chars()
                .forEach(c -> opposite(arr, (char) c));


        return arr[0] == 0 && arr[1] == 0;
    }

    private static void opposite(int[] arr, char c) {
        switch (c) {
            case 'U' -> arr[0]++;
            case 'D' -> arr[0]--;
            case 'L' -> arr[1]--;
            case 'R' -> arr[1]++;
        }
    }
}
