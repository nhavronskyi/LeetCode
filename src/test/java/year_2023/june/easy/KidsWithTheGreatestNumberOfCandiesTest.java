package year_2023.june.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.example.year_2023.june.easy.KidsWithTheGreatestNumberOfCandies.kidsWithCandies;

public class KidsWithTheGreatestNumberOfCandiesTest {
    @Test
    public void test() {
        Assert.assertEquals(List.of(true, true, true, false, true), kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        Assert.assertEquals(List.of(true, false, false, false, false), kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
        Assert.assertEquals(List.of(true, false, true), kidsWithCandies(new int[]{12, 1, 12}, 10));
    }
}
