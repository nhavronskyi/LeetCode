package year_2023.july.easy;

import org.example.year_2023.july.easy.PlusOne;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlusOneTest {
    private final PlusOne plusOne = new PlusOne();

    @Test
    public void test1() {
        Assertions.assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    public void test2() {
        Assertions.assertArrayEquals(new int[]{4, 3, 2, 2}, plusOne.plusOne(new int[]{4, 3, 2, 1}));
    }

    @Test
    public void test3() {
        Assertions.assertArrayEquals(new int[]{1, 0}, plusOne.plusOne(new int[]{9}));
    }

}
