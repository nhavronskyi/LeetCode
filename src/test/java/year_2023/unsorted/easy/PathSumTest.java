package year_2023.unsorted.easy;

import org.junit.Test;

import static org.example.year_2023.july.easy.PathSum.convertArrToTreeNode;
import static org.example.year_2023.july.easy.PathSum.hasPathSum;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PathSumTest {

    @Test
    public void trueTest() {
        trueTest(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1}, 22);
        trueTest(new Integer[]{1, 2, 3}, 4);
    }

    @Test
    public void falseTest() {
        falseTest(new Integer[]{1, 2, 3}, 5);
        falseTest(new Integer[]{}, 0);
    }

    private void falseTest(Integer[] nums, int target) {
        assertFalse(hasPathSum(convertArrToTreeNode(nums), target));
    }

    private void trueTest(Integer[] nums, int target) {
        assertTrue(hasPathSum(convertArrToTreeNode(nums), target));
    }
}
