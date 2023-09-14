package year_2023.september.easy;

import org.example.year_2023.september.easy.MinimumSumOfFourDigitNumberAfterSplittingDigits;
import org.junit.Assert;
import org.junit.Test;

public class MinimumSumOfFourDigitNumberAfterSplittingDigitsTest {
    @Test
    public void test() {
        test(52, 2932);
        test(13, 4009);
    }

    private void test(int exp, int act) {
        Assert.assertEquals(exp, MinimumSumOfFourDigitNumberAfterSplittingDigits.minimumSum(act));
    }
}
