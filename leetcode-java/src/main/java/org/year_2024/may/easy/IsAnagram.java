package org.year_2024.may.easy;

import java.util.stream.IntStream;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        var sArr = getArr(s);
        var tArr = getArr(t);

        return IntStream.range(0, sArr.length)
                .allMatch(i -> sArr[i] == tArr[i]);
    }

    private static int[] getArr(String str) {
        return str.chars()
                .boxed()
                .mapToInt(i -> i)
                .sorted()
                .toArray();
    }
}
