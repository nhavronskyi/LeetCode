package year_2023.july.easy;

import org.junit.Test;

import static org.example.year_2023.july.easy.ReverseVowelsOfAString.reverseVowels;
import static org.junit.Assert.assertEquals;

public class ReverseVowelsOfAStringTest {
    @Test
    public void lowerCaseTest() {
        assertEquals("holle", reverseVowels("hello"));
        assertEquals("leotcede", reverseVowels("leetcode"));
    }

    @Test
    public void upperCaseTest() {
        assertEquals("HOLLE", reverseVowels("HELLO"));
        assertEquals("LEOTCEDE", reverseVowels("LEETCODE"));
    }

    @Test
    public void mixedCaseTest() {
        assertEquals("hollE", reverseVowels("hEllo"));
        assertEquals("lEotcEde", reverseVowels("leEtcodE"));
    }
}
