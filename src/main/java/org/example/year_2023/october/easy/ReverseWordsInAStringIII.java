package org.example.year_2023.october.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInAStringIII {
    public static String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .collect(Collectors.joining(" "));
    }
}
