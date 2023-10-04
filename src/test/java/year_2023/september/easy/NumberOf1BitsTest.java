package year_2023.september.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.example.year_2023.september.easy.NumberOf1Bits.convertBinaryToInt;
import static org.example.year_2023.september.easy.NumberOf1Bits.hammingWeight;

public class NumberOf1BitsTest {
    @Test
    public void test() {
        test(3, "00000000000000000000000000001011");
        test(1, "00000000000000000000000010000000");
        test(31, "11111111111111111111111111111101");
    }

    private void test(int exp, String binaryCode) {
        Assert.assertEquals(exp, hammingWeight(convertBinaryToInt(binaryCode)));
    }
}
