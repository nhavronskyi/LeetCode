package easy;

import org.example.june.easy.ClimbingStairs;
import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {
    @Test
    public void testFor1() {
        Assert.assertEquals(1, ClimbingStairs.climbStairs(1));
    }

    @Test
    public void testFor2() {
        Assert.assertEquals(2, ClimbingStairs.climbStairs(2));
    }

    @Test
    public void testFor3() {
        Assert.assertEquals(3, ClimbingStairs.climbStairs(3));
    }

    @Test
    public void testFor4() {
        Assert.assertEquals(5, ClimbingStairs.climbStairs(4));
    }
}
