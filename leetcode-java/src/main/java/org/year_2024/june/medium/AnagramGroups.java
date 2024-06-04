package org.year_2024.june.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroups {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> map = new HashMap<>();

        for (String str : strs) {
            List<Integer> arr = str.chars()
                    .boxed()
                    .sorted()
                    .toList();

            if (!map.containsKey(arr)) {
                map.put(arr, new ArrayList<>());
            }

            map.get(arr).add(str);
        }

        return map.values()
                .stream()
                .toList();
    }
}
