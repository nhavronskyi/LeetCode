package org.year_2024.april.easy;

public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        int sLength = s.length();

        for (int patternLength = 1; patternLength <= sLength / 2; patternLength++) {
            if (sLength % patternLength == 0) {
                int i = patternLength;
                var pattern = s.substring(0, patternLength);
                var skip = s.substring(i, i + patternLength);
                while (i < sLength && skip.equals(pattern)) {
                    i += patternLength;
                }
                if (i == sLength) {
                    return true;
                }
            }
        }

        return false;
    }
}
