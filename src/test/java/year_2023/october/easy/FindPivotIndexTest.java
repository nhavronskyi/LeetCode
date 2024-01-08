package year_2023.october.easy;

import org.example.year_2023.october.easy.FindPivotIndex;
import org.junit.Assert;
import org.junit.Test;

public class FindPivotIndexTest {
    @Test
    public void test() {
        test(3, 1, 7, 3, 6, 5, 6);
        test(-1, 1, 2, 3);
        test(0, 2, 1, -1);
    }

    private void test(int exp, int... arr) {
        Assert.assertEquals(exp, FindPivotIndex.pivotIndex(arr));
    }
}
