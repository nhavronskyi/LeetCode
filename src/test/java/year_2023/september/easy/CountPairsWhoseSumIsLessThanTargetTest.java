package year_2023.september.easy;

import org.example.year_2023.september.easy.CountPairsWhoseSumIsLessThanTarget;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTargetTest {
    @Test
    public void test() {
        test(3, List.of(-1, 1, 2, 3, 1), 2);
        test(10, List.of(-6, 2, 5, -2, -7, -1, 3), -2);
    }

    public void test(int exp, List<Integer> list, int target) {
        Assert.assertEquals(exp, CountPairsWhoseSumIsLessThanTarget.countPairs(new LinkedList<>(list), target));
    }
}
