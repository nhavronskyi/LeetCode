package year_2023.july.easy;

import org.example.year_2023.july.easy.ReverseString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    public void test1() {
        helper("hello");
    }

    @Test
    public void test2() {
        helper("Hannah");
    }

    private void helper(String s) {
        var test = s.toCharArray();

        ReverseString.reverseString(test);

        var ans = new StringBuilder(s).reverse().toString().toCharArray();

        Assertions.assertArrayEquals(ans, test);
    }
}
