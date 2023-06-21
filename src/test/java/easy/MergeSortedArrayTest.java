package easy;

import org.example.easy.MergeSortedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {
    private final MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    public void normal() {
        int[] arr1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] arr2 = new int[]{2, 5, 6};

        mergeSortedArray.merge(arr1, 3, arr2, 3);

        Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, arr1);
    }

    @Test
    public void arr2IsEmpty() {
        int[] arr1 = new int[]{1};
        int[] arr2 = new int[]{};

        mergeSortedArray.merge(arr1, 1, arr2, 0);

        Assertions.assertArrayEquals(new int[]{1}, arr1);
    }

    @Test
    public void oneElementArrays() {
        int[] arr1 = new int[]{0};
        int[] arr2 = new int[]{1};

        mergeSortedArray.merge(arr1, 0, arr2, 1);

        Assertions.assertArrayEquals(new int[]{1}, arr1);
    }
}
