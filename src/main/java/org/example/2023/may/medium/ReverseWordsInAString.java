package org.example.may.medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        var arr = s.split(" ");
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            var temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        return Arrays.stream(arr)
                .filter(x -> !x.equals(""))
                .collect(Collectors.joining(" "));
    }
}
