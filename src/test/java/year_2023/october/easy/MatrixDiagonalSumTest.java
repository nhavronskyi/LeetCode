package year_2023.october.easy;

import org.example.year_2023.october.easy.MatrixDiagonalSum;
import org.junit.Assert;
import org.junit.Test;

public class MatrixDiagonalSumTest {
    @Test
    public void test() {
        test(25, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        test(8, new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}});
        test(5, new int[][]{{5}});
    }

    private void test(int exp, int[][] act) {
        Assert.assertEquals(exp, MatrixDiagonalSum.diagonalSum(act));
    }
}
