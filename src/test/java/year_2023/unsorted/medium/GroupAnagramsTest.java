package year_2023.unsorted.medium;

import org.example.year_2023.june.medium.GroupAnagrams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GroupAnagramsTest {
    private final GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void normal() {
        var test = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        var ans = List.of(
                List.of("tan", "nat"),
                List.of("bat"),
                List.of("eat", "tea", "ate")
        );

        Assertions.assertEquals(ans, test);
    }

    @Test
    public void empty() {
        Assertions.assertEquals(List.of(), groupAnagrams.groupAnagrams(new String[]{}));
    }

    @Test
    public void single() {
        Assertions.assertEquals(List.of(
                List.of("a")
        ), groupAnagrams.groupAnagrams(new String[]{"a"}));
    }
}
