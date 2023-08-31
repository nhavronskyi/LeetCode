package year_2023.may.easy;

import org.example.year_2023.may.medium.TwoSumII;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumIITest {
    private final TwoSumII twoSumII = new TwoSumII();

    @Test
    public void positive() {
        Assertions.assertArrayEquals(new int[]{1, 2}, twoSumII.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void negative() {
        Assertions.assertArrayEquals(new int[]{1, 3}, twoSumII.twoSum(new int[]{-2, -3, -4}, -6));
    }

    @Test
    public void mixed() {
        Assertions.assertArrayEquals(new int[]{1, 2}, twoSumII.twoSum(new int[]{-1, 0}, -1));
    }
}
