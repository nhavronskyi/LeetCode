package year_2023.june.easy;

import org.example.year_2023.june.easy.ConcatenationOfArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConcatenationOfArrayTest {
    @Test
    public void tests() {
        ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();

        int[] test1 = {1, 2, 3};
        int[] test2 = {1, 2};
        int[] test3 = {1, 1, 2, 3};
        int[] test4 = {4, 3, 2, 1};

        assertArrayEquals(new int[]{1, 2, 3, 1, 2, 3}, concatenationOfArray.getConcatenation(test1));
        assertArrayEquals(new int[]{1, 2, 1, 2}, concatenationOfArray.getConcatenation(test2));
        assertArrayEquals(new int[]{1, 1, 2, 3, 1, 1, 2, 3}, concatenationOfArray.getConcatenation(test3));
        assertArrayEquals(new int[]{4, 3, 2, 1, 4, 3, 2, 1}, concatenationOfArray.getConcatenation(test4));
    }
}
