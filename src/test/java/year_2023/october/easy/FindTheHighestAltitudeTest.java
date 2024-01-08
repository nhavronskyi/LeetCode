package year_2023.october.easy;

import org.example.year_2023.october.easy.FindTheHighestAltitude;
import org.junit.Assert;
import org.junit.Test;

public class FindTheHighestAltitudeTest {
    @Test
    public void test() {
        test(1, -5, 1, 5, 0, -7);
        test(0, -4, -3, -2, -1, 4, 3, 2);
    }

    private void test(int exp, int... curr) {
        Assert.assertEquals(exp, FindTheHighestAltitude.largestAltitude(curr));
    }
}
