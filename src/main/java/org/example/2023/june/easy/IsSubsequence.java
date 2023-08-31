package org.example.june.easy;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        for (char c : t.toCharArray()) {
            if (s.charAt(i) == c) {
                i++;
            }
        }
        return i == s.length();
    }
}
