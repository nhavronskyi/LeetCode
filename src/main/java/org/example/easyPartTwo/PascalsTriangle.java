package org.example.easyPartTwo;

import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new LinkedList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> prevRow = result.get(i - 1);
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
            }
            result.add(row);
        }

        return result;
    }
}
