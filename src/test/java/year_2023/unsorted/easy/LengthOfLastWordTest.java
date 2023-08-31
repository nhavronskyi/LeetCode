package year_2023.unsorted.easy;

import org.example.year_2023.may.easy.LengthOfLastWord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthOfLastWordTest {
    private final LengthOfLastWord length = new LengthOfLastWord();

    @Test
    public void twoWords() {
        String s = "Hello World";
        Assertions.assertEquals(5, length.lengthOfLastWord(s));
    }

    @Test
    public void fiveWords() {
        String s = "   fly me   to   the moon  ";
        Assertions.assertEquals(4, length.lengthOfLastWord(s));
    }

    @Test
    public void fourWords() {
        String s = "luffy is still joyboy";
        Assertions.assertEquals(6, length.lengthOfLastWord(s));
    }
}
