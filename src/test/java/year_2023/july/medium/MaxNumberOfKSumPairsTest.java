package year_2023.july.medium;

import org.junit.Test;

import static org.example.year_2023.july.medium.MaxNumberOfKSumPairs.maxOperations;
import static org.junit.Assert.assertEquals;

public class MaxNumberOfKSumPairsTest {
    @Test
    public void test() {
        assertEquals(2, maxOperations(new int[]{1, 2, 3, 4}, 5));
        assertEquals(1, maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
        assertEquals(0, maxOperations(new int[]{3, 5, 1, 5}, 2));
        assertEquals(2, maxOperations(new int[]{4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4}, 2));
    }
}
