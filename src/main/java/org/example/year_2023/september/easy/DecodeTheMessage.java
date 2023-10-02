package org.example.year_2023.september.easy;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class DecodeTheMessage {
    public static String decodeMessage(String key, String message) {
        var map = key.chars()
                .filter(c -> c != ' ')
                .distinct()
                .mapToObj(c -> (char) c)
                .collect(HashMap::new,
                        putCharacterToMap(),
                        HashMap::putAll);

        return message.chars()
                .mapToObj(c -> (char) c)
                .map(c -> map.getOrDefault(c, c))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private static BiConsumer<HashMap<Character, Character>, Character> putCharacterToMap() {
        return (hashMap, c) -> hashMap.put(c, (char) Integer.sum('a', hashMap.size()));
    }

}
