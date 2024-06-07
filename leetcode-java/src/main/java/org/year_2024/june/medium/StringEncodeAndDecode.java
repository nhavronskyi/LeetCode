package org.year_2024.june.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringEncodeAndDecode {

    private static final String REGEX = "#:;#";
    public static final char codingSymbol = '@';

    public static String encode(List<String> strs) {
        return Optional.ofNullable(strs)
                .filter(list -> !list.isEmpty())
                .map(list -> list.stream()
                        .map(word -> encryptWords(word, c -> c + codingSymbol))
                        .collect(Collectors.joining(REGEX))
                ).orElse(null);
    }

    public static List<String> decode(String str) {
        return Optional.ofNullable(str)
                .map(s -> Arrays.stream(s.split(REGEX))
                        .map(word -> encryptWords(word, c -> c - codingSymbol))
                        .toList())
                .orElse(List.of());
    }

    private static String encryptWords(String word, Function<Integer, Integer> function) {
        return word.chars()
                .boxed()
                .map(function)
                .map(x -> (char) x.intValue())
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
