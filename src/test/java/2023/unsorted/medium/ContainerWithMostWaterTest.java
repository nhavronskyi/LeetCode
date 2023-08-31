package medium;

import org.example.june.medium.ContainerWithMostWater;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {
    private final ContainerWithMostWater container = new ContainerWithMostWater();

    @Test
    public void nineNumbers() {
        Assertions.assertEquals(49, container.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    public void twoNumbers() {
        Assertions.assertEquals(1, container.maxArea(new int[]{1, 1}));
    }

}
