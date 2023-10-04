package year_2023.september.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.example.year_2023.september.easy.ReverseBits.*;

public class ReverseBitsTest {
    @Test
    public void test() {
        test(964_176_192L, "00000010100101000001111010011100");
        test(3_221_225_471L, "11111111111111111111111111111101");
    }

    private void test(long ans, String act) {
        Assert.assertEquals(ans, convertReversedBitsToLong(reverseBits(parseBinaryToInt(act))));
    }
}
