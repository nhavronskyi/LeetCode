package year_2023.july.easy;

import org.example.year_2023.july.easy.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    @Test
    public void tests() {
        TwoSum twoSum = new TwoSum();

        int[] test1 = {2, 7, 11, 15};
        int[] test2 = {3, 2, 4};
        int[] test3 = {3, 3};
        int[] test4 = {0, 4, 3, 0};

        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(test1, 9));
        assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(test2, 6));
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(test3, 6));
        assertArrayEquals(new int[]{0, 3}, twoSum.twoSum(test4, 0));
    }
}
