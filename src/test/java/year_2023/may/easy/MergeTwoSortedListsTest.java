package year_2023.may.easy;

import org.example.year_2023.may.easy.MergeTwoSortedLists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedListsTest {

    @Test
    public void normal() {
        helper(new int[]{1, 2, 4}, new int[]{1, 3, 4}, new int[]{1, 1, 2, 3, 4, 4});
    }

    @Test
    public void empty() {
        helper(new int[]{}, new int[]{}, new int[]{});
    }

    @Test
    public void oneIsEmpty() {
        helper(new int[]{}, new int[]{0}, new int[]{0});
    }

    private void helper(int[] l1, int[] l2, int[] ans) {
        MergeTwoSortedLists list1 = new MergeTwoSortedLists();
        Arrays.stream(l1).forEach(list1::add);

        MergeTwoSortedLists list2 = new MergeTwoSortedLists();
        Arrays.stream(l2).forEach(list2::add);

        var test = MergeTwoSortedLists.mergeTwoLists(list1.getHead(), list2.getHead());

        var list = new ArrayList<Integer>();
        while (test != null) {
            list.add(test.val);
            test = test.next;
        }

        Assertions.assertArrayEquals(ans, list.stream().mapToInt(x -> x).toArray());
    }
}
