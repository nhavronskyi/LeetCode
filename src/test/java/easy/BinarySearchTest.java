package easy;

import org.example.easy.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    private final BinarySearch binarySearch = new BinarySearch();

    private final int[] test = new int[]{-1, 0, 3, 5, 9, 12};

    @Test
    public void correct() {
        Assertions.assertEquals(4, binarySearch.search(test, 9));
        Assertions.assertEquals(4, binarySearch.myBinarySearch(test, 9));
    }

    @Test
    public void wrong() {
        Assertions.assertEquals(-1, binarySearch.myBinarySearch(test, 2));
        Assertions.assertEquals(-1, binarySearch.myBinarySearch(test, 2));
    }
}
