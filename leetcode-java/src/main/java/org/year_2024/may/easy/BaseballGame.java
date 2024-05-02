package org.year_2024.may.easy;

import java.util.LinkedList;
import java.util.List;

public class BaseballGame {
    public static int calPoints(String[] operations) {
        List<Integer> result = new LinkedList<>();
        for (String operation : operations) {
            switch (operation) {
                case "+" -> plusOption(result);
                case "D" -> dOption(result);
                case "C" -> cOption(result);
                default -> numberOperation(operation, result);
            }
        }

        return result.stream()
                .mapToInt(x -> x)
                .sum();
    }

    private static void numberOperation(String operation, List<Integer> result) {
        String numberRegex = "-?\\d+(\\.\\d+)?";
        if (operation.matches(numberRegex)) {
            result.add(Integer.parseInt(operation));
        }
    }

    private static void cOption(List<Integer> result) {
        result.remove(getLastIndex(result));
    }

    private static void dOption(List<Integer> result) {
        result.add(getFromTail(result, 0) * 2);
    }

    private static void plusOption(List<Integer> result) {
        result.add(getFromTail(result, 0) + getFromTail(result, 1));
    }

    private static Integer getFromTail(List<Integer> result, int offset) {
        return result.get(getLastIndex(result) - offset);
    }

    private static int getLastIndex(List<Integer> result) {
        return result.size() - 1;
    }
}
