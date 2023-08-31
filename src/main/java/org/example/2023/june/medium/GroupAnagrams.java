package org.example.june.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        return Stream.of(strs)
                .collect(Collectors.groupingBy(
                        s -> Arrays.toString(s.chars()
                                .sorted()
                                .mapToObj(c -> (char) c)
                                .toArray(Character[]::new)),
                        Collectors.toList()
                ))
                .values().stream()
                .toList();
    }
}
