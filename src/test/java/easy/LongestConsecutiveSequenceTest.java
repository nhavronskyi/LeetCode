package easy;

import org.example.easy.LongestConsecutiveSequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestConsecutiveSequenceTest {
    private final LongestConsecutiveSequence sequence = new LongestConsecutiveSequence();

    @Test
    public void test1() {
        Assertions.assertEquals(4, sequence.longestConsecutive(new int[]{100, 4, 200, 1, 2, 3}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(9, sequence.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }
}
