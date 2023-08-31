package year_2023.june.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.example.year_2023.june.easy.CanPlaceFlowers.canPlaceFlowers;

public class CanPlaceFlowersTest {
    @Test
    public void trueTest() {
        Assert.assertTrue(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        Assert.assertTrue(canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1));
        Assert.assertTrue(canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 1));
    }

    @Test
    public void falseTest() {
        Assert.assertFalse(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        Assert.assertFalse(canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
    }
}
