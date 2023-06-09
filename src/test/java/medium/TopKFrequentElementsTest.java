package medium;

import org.example.medium.TopKFrequentElements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TopKFrequentElementsTest {
    private final TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
    private final int[] oneNumberArray = {1};
    private final int[] positiveNumbersArray = {1, 1, 1, 2, 2, 3};
    private final int[] negativeNumbersArray = {-1, -1, -1, -2, -2, -3};
    private final int[] mixedNumbersArray = {-1, -1, 1, 2, 2, 3};

    @Test
    public void oneNumberArray() {
        Assertions.assertArrayEquals(new int[]{1}, topKFrequentElements.topKFrequent(oneNumberArray, 1));
    }

    @Test
    public void positiveNumbersArray() {
        Assertions.assertArrayEquals(new int[]{1, 2}, topKFrequentElements.topKFrequent(positiveNumbersArray, 2));
    }

    @Test
    public void negativeNumbersArray() {
        Assertions.assertArrayEquals(new int[]{-1, -2}, topKFrequentElements.topKFrequent(negativeNumbersArray, 2));
    }

    @Test
    public void mixedNumbersArray() {
        Assertions.assertArrayEquals(new int[]{-1, 2}, topKFrequentElements.topKFrequent(mixedNumbersArray, 2));
    }
}
