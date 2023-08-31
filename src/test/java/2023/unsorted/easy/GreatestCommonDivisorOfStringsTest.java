package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.example.june.easy.GreatestCommonDivisorOfStrings.gcdOfStrings;

public class GreatestCommonDivisorOfStringsTest {
    @Test
    public void test() {
        Assert.assertEquals("ABC", gcdOfStrings("ABCABC", "ABC"));
        Assert.assertEquals("AB", gcdOfStrings("ABABAB", "ABAB"));
        Assert.assertEquals("TAUXX", gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }

    @Test
    public void emptyTest() {
        Assert.assertEquals("", gcdOfStrings("LEET", "CODE"));
        Assert.assertEquals("", gcdOfStrings("ABCDEF", "ABC"));
    }
}
