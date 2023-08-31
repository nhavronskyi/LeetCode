package medium;

import org.example.june.medium.IntegerToRoman;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerToRomainTest {
    @Test
    public void test() {
        Assertions.assertEquals("III", IntegerToRoman.intToRoman(3));
        Assertions.assertEquals("IV", IntegerToRoman.intToRoman(4));
        Assertions.assertEquals("LVIII", IntegerToRoman.intToRoman(58));
        Assertions.assertEquals("MCMXCIV", IntegerToRoman.intToRoman(1994));
    }
}
