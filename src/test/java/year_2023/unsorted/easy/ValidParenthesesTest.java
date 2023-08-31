package year_2023.unsorted.easy;

import org.example.year_2023.june.easy.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {
    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void correct() {
        assertTrue(validParentheses.isValid("()"));
    }

    @Test
    public void correct2() {
        assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    public void wrong() {
        assertFalse(validParentheses.isValid("(]"));
    }

    @Test
    public void wrong2() {
        assertFalse(validParentheses.isValid("([)]"));
    }

    @Test
    public void wrong3() {
        assertFalse(validParentheses.isValid("["));
    }
}
