package year_2023.july.easy;

import org.example.year_2023.july.easy.RomanToInteger;
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
