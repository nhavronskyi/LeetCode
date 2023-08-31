package medium;

import org.example.may.medium.RemoveDuplicatesFromSortedArrayII;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayIITest {
    private final RemoveDuplicatesFromSortedArrayII removeDuplicates = new RemoveDuplicatesFromSortedArrayII();

    @Test
    public void sixNums() {
        int[] test = {1, 1, 1, 2, 2, 3};
        int[] ans = {1, 1, 2, 2, 3};

        testHelper(test, ans);
    }

    @Test
    public void nineNums() {
        int[] test = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int[] ans = {0, 0, 1, 1, 2, 3, 3};

        testHelper(test, ans);
    }

    private void testHelper(int[] test, int[] ans) {
        int k = removeDuplicates.removeDuplicates(test);

        for (int i = 0; i < k; i++) {
            Assertions.assertEquals(test[i], ans[i]);
        }
    }
}
