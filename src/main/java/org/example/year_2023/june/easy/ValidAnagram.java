package org.example.year_2023.june.easy;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            for (String x : s.split("")) {
                t = t.replaceFirst(x, "");
            }
            return t.isEmpty();
        }
        return false;
    }
}
