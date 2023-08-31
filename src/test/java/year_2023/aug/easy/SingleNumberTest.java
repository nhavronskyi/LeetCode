package year_2023.aug.easy;

import org.example.year_2023.aug.easy.SingleNumber;
import org.junit.Assert;
import org.junit.Test;

public class SingleNumberTest {
    @Test
    public void test() {
        test(1, new int[]{2, 2, 1});
        test(4, new int[]{4, 1, 2, 1, 2});
        test(1, new int[]{1});
    }

    private void test(int exp, int[] act) {
        Assert.assertEquals(exp, SingleNumber.singleNumber(act));
    }
}
