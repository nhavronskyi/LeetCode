package medium;

import org.junit.Test;

import static org.example.may.medium.ReverseWordsInAString.reverseWords;
import static org.junit.Assert.assertEquals;

public class ReverseWordsInAStringTest {
    @Test
    public void testOne() {
        assertEquals("blue is sky the", reverseWords("the sky is blue"));
    }

    @Test
    public void testTwo() {
        assertEquals("world hello", reverseWords("  hello world  "));
    }

    @Test
    public void testThree() {
        assertEquals("example good a", reverseWords("a good   example"));
    }
}
