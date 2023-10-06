package year_2023.october.easy;

import org.example.year_2023.october.easy.UniqueMorseCodeWords;
import org.junit.Assert;
import org.junit.Test;

public class UniqueMorseCodeWordsTest {
    @Test
    public void test() {
        test(2, "gin", "zen", "gig", "msg");
        test(1, "a");
    }

    private void test(int i, String... strings) {
        UniqueMorseCodeWords morseCodeWords = new UniqueMorseCodeWords();

        Assert.assertEquals(i, morseCodeWords.uniqueMorseRepresentations(strings));
    }
}
