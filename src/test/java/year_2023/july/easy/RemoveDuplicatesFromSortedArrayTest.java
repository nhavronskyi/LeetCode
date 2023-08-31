package year_2023.july.easy;

import org.example.year_2023.july.easy.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    private final RemoveDuplicatesFromSortedArray removeDuplicates = new RemoveDuplicatesFromSortedArray();

    @Test
    public void fourNums() {
        int[] test = {1, 1, 2};
        int[] ans = {1, 2};

        testHelper(test, ans);
    }

    @Test
    public void eightNums() {
        int[] test = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] ans = {0, 1, 2, 3, 4};

        testHelper(test, ans);
    }

    private void testHelper(int[] test, int[] ans) {
        int k = removeDuplicates.removeDuplicates(test);

        for (int i = 0; i < k; i++) {
            Assertions.assertEquals(test[i], ans[i]);
        }
    }
}
