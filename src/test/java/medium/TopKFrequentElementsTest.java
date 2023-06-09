package medium;

import org.example.medium.TopKFrequentElements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TopKFrequentElementsTest {
    private final TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
    private final int[] oneNumberMassive = {1};
    private final int[] positiveNumbersMassive = {1, 1, 1, 2, 2, 3};
    private final int[] negativeNumbersMassive = {-1, -1, -1, -2, -2, -3};
    private final int[] mixedNumbersMassive = {-1, -1, 1, 2, 2, 3};

    @Test
    public void oneNumberMassive() {
        Assertions.assertArrayEquals(new int[]{1}, topKFrequentElements.topKFrequent(oneNumberMassive, 1));
    }

    @Test
    public void positiveNumbersMassive() {
        Assertions.assertArrayEquals(new int[]{1, 2}, topKFrequentElements.topKFrequent(positiveNumbersMassive, 2));
    }

    @Test
    public void negativeNumbersMassive() {
        Assertions.assertArrayEquals(new int[]{-1, -2}, topKFrequentElements.topKFrequent(negativeNumbersMassive, 2));
    }

    @Test
    public void mixedNumbersMassive() {
        Assertions.assertArrayEquals(new int[]{-1, 2}, topKFrequentElements.topKFrequent(mixedNumbersMassive, 2));
    }
}
