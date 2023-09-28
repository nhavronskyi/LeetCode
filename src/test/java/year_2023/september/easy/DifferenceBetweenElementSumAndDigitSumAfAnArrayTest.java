package year_2023.september.easy;

import org.example.year_2023.september.easy.DifferenceBetweenElementSumAndDigitSumAfAnArray;
import org.junit.Assert;
import org.junit.Test;

public class DifferenceBetweenElementSumAndDigitSumAfAnArrayTest {
    @Test
    public void test() {
        test(9, new int[]{1, 15, 6, 3});
        test(0, new int[]{1, 2, 3, 4});
    }

    private void test(int exp, int[] act) {
        Assert.assertEquals(exp, DifferenceBetweenElementSumAndDigitSumAfAnArray.differenceOfSum(act));
    }
}
