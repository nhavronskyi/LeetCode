package org.year_2024.june.easy;

public class CheckIfTwoStringArraysAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return toJoinedString(word1).equals(toJoinedString(word2));
    }

    private static String toJoinedString(String[] words) {
        return String.join("", words);
    }
}
