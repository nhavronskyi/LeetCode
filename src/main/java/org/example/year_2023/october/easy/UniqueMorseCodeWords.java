package org.example.year_2023.october.easy;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UniqueMorseCodeWords {
    private final Map<Character, String> morse;

    public UniqueMorseCodeWords() {
        String code = ".- / -... / -.-. / -.. / . / ..-. / --. / .... / .. / .--- / -.- / .-.. / -- / -. / --- / .--. / --.- / .-. / ... / - / ..- / ...- / .-- / -..- / -.-- / --..";
        var codeArr = code.split(" / ");
        this.morse = IntStream.range(0, codeArr.length)
                .boxed()
                .collect(Collectors.toMap(i -> (char) (i + 'a'), i -> codeArr[i]));
    }

    public String wordToMorse(String word) {
        return word.chars()
                .mapToObj(x -> (char) x)
                .map(morse::get)
                .collect(Collectors.joining());
    }

    public int uniqueMorseRepresentations(String[] words) {
        return (int) Arrays.stream(words)
                .map(this::wordToMorse)
                .distinct()
                .count();
    }
}
