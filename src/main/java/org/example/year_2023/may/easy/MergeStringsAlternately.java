package org.example.year_2023.may.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        var w1 = word1.split("");
        var w2 = word2.split("");

        int maxL = Math.max(w1.length, w2.length);

        Queue<String> st1 = new LinkedList<>(Arrays.asList(w1));

        Queue<String> st2 = new LinkedList<>(Arrays.asList(w2));

        for (int i = 0; i < maxL; i++) {
            if (st1.iterator().hasNext()) {
                sb.append(st1.poll());
            }
            if (st2.iterator().hasNext()) {
                sb.append(st2.poll());
            }
        }

        return sb.toString();
    }
}
