package year_2023.october.easy;

import org.example.year_2023.october.easy.MaximumAverageSubarrayI;
import org.junit.Assert;
import org.junit.Test;

public class MaximumAverageSubarrayITest {
    @Test
    public void test() {
        test(12.75, 4, 1, 12, -5, -6, 50, 3);
        test(5.0, 1, 5);
    }

    private void test(double ans, int k, int... nums) {
        Assert.assertEquals(ans, MaximumAverageSubarrayI.findMaxAverage(nums, k), 0);
    }
}
