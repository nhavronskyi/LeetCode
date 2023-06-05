package org.example.easy;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            for (String x : s.split("")) {
                t = t.replaceFirst(x, "");
            }
            return t.length() == 0;
        }
        return false;
    }
}
