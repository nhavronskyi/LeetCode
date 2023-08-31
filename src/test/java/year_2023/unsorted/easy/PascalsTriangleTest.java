package year_2023.unsorted.easy;

import org.example.year_2023.july.easy.PascalsTriangle;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PascalsTriangleTest {
    @Test
    public void test() {
        test(List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1)), 5);
        test(List.of(List.of(1)), 1);
    }

    private void test(List<List<Integer>> exp, int numRows) {
        Assert.assertEquals(exp, PascalsTriangle.generate(numRows));
    }
}
