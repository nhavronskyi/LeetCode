package year_2023.october.easy;

import org.example.year_2023.october.easy.ReverseWordsInAStringIII;
import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInAStringIIITest {
    @Test
    public void test() {
        test("s'teL ekat edoCteeL tsetnoc", "Let's take LeetCode contest");
        test("doG gniD", "God Ding");
    }

    private void test(String exp, String act) {
        Assert.assertEquals(exp, ReverseWordsInAStringIII.reverseWords(act));
    }
}
