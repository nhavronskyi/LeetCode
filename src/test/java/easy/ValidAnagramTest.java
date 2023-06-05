package easy;

import org.example.easy.ValidAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {
    private final ValidAnagram validAnagram = new ValidAnagram();
    private final String[] test1 = {"anagram", "nagaram"};
    private final String[] test2 = {"ab", "a"};
    private final String[] test3 = {"a", "ab"};
    private final String[] test4 = {"aacc", "ccac"};

    @Test
    public void test1() {
        assertTrue(validAnagram.isAnagram(test1[0], test1[1]));
    }

    @Test
    public void test2() {
        assertFalse(validAnagram.isAnagram(test2[0], test2[1]));
    }

    @Test
    public void test3() {
        assertFalse(validAnagram.isAnagram(test3[0], test3[1]));
    }

    @Test
    public void test4() {
        assertFalse(validAnagram.isAnagram(test4[0], test4[1]));
    }
}
