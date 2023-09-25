package year_2023.september.easy;

import org.example.year_2023.september.easy.LeftAndRightSumDifferences;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeftAndRightSumDifferencesTest {
    @Test
    public void test() {
        Assertions.assertArrayEquals(new int[]{15, 1, 11, 22}, LeftAndRightSumDifferences.leftRightDifference(new int[]{10, 4, 8, 3}));
        Assertions.assertArrayEquals(new int[]{0}, LeftAndRightSumDifferences.leftRightDifference(new int[]{1}));
    }
}
