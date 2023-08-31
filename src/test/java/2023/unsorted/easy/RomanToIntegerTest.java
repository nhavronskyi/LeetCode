package easy;

import org.example.july.db.RomanToInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {
    private final RomanToInteger roman = new RomanToInteger();

    @Test
    public void iii() {
        Assertions.assertEquals(3, roman.romanToInt("III"));
    }

    @Test
    public void lviii() {
        Assertions.assertEquals(58, roman.romanToInt("LVIII"));
    }

    @Test
    public void mcmciv() {
        Assertions.assertEquals(1994, roman.romanToInt("MCMXCIV"));
    }
}
