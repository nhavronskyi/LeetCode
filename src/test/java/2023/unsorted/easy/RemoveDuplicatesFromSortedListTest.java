package easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {

    @Test
    public void test() {
        test(new int[]{1, 2}, new int[]{1, 1, 2});
        test(new int[]{1, 2, 3}, new int[]{1, 1, 2, 3, 3});
        test(new int[]{}, new int[]{});
    }

    private void test(int[] exp, int[] act) {
        Assert.assertArrayEquals(exp, convertListNodeToArr(deleteDuplicates(convertArrToListNode(act))));
    }
}
