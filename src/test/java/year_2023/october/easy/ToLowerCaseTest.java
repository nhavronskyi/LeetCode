package year_2023.october.easy;

import org.example.year_2023.october.easy.ToLowerCase;
import org.junit.Assert;
import org.junit.Test;

public class ToLowerCaseTest {
    @Test
    public void test() {
        test("hello", "Hello");
        test("here", "here");
        test("lovely", "LOVELY");
    }

    private void test(String exp, String act) {
        Assert.assertEquals(exp, ToLowerCase.toLowerCase(act));
    }
}
