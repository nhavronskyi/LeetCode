package org.example.may.easy;

import java.util.stream.Stream;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        return Stream.of(strs)
                .reduce((s1, s2) -> {
                    while (!s2.startsWith(s1)) {
                        s1 = s1.substring(0, s1.length() - 1);
                    }
                    return s1;
                }).orElse("");
    }
}
