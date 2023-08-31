package easy;

import org.junit.Test;

import static org.example.may.easy.MoveZeroes.moveZeroes;
import static org.junit.Assert.assertArrayEquals;

public class MoveZeroesTest {

    @Test
    public void testOne() {
        test(new int[]{1, 3, 12, 0, 0}, new int[]{0, 1, 0, 3, 12});
    }

    @Test
    public void testTwo() {
        test(new int[]{0}, new int[]{0});
    }

    private void test(int[] expected, int[] actual) {
        moveZeroes(actual);
        assertArrayEquals(expected, actual);
    }
}
