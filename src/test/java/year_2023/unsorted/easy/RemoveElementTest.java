package year_2023.unsorted.easy;

import org.example.year_2023.july.easy.RemoveElement;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.sort;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {
    private final RemoveElement removeElement = new RemoveElement();

    @Test
    public void fourNums() {
        int[] test = {3, 2, 2, 3};
        int[] ans = {2, 2};

        testHelper(test, ans, 3);
    }

    @Test
    public void eightNums() {
        int[] test = {0, 1, 2, 2, 3, 0, 4, 2};
        int[] ans = {0, 1, 4, 0, 3};

        testHelper(test, ans, 2);
    }

    private void testHelper(int[] test, int[] ans, int toRemove) {
        int k = removeElement.removeElement(test, toRemove);

        sort(test, 0, k);
        sort(ans, 0, k);
        for (int i = 0; i < k; i++) {
            assertEquals(test[i], ans[i]);
        }
    }
}
