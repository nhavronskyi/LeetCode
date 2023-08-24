package easyPartTwo;

import org.junit.Test;

import static org.example.easyPartTwo.LinkedListCycle.hasCycle;
import static org.example.helpers.list.List.convertToListNode;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LinkedListCycleTest {
    @Test
    public void trueTest() {
        trueTest(3, 2, 0, -4);
        trueTest(1, 2);
    }

    @Test
    public void falseTest() {
        falseTest(1);
    }

    private void trueTest(int... exp) {
        assertTrue(hasCycle(convertToListNode(exp, true)));
    }

    private void falseTest(int... exp) {
        assertFalse(hasCycle(convertToListNode(exp, false)));
    }
}
