package year_2023.september.easy;

import org.example.year_2023.september.easy.DecodeTheMessage;
import org.junit.Assert;
import org.junit.Test;

public class DecodeTheMessageTest {
    @Test
    public void test() {
        test("this is a secret", "the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
        test("the five boxing wizards jump quickly", "eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb");
    }

    private void test(String exp, String key, String message) {
        Assert.assertEquals(exp, DecodeTheMessage.decodeMessage(key, message));
    }
}
