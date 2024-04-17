package org.example.year_2024.april.easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (needle.charAt(0) == haystack.charAt(i)) {
                for (int j = i, needleInd = 0; j < haystack.length(); j++) {
                    if (haystack.charAt(j) == needle.charAt(needleInd)) {
                        needleInd = needleInd + 1;
                    } else {
                        break;
                    }

                    if (needleInd == needle.length()) {
                        return j - needle.length() + 1;
                    }
                }
            }
        }

        return -1;
    }
}
