package easyPartTwo;

import org.junit.Test;

import static org.example.easyPartTwo.IsSubsequence.isSubsequence;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsSubsequenceTest {
    @Test
    public void trueTest() {
        assertTrue(isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void falseTest() {
        assertFalse(isSubsequence("axc", "ahbgdc"));
        assertFalse(isSubsequence("acb", "ahbgdc"));
        assertFalse(isSubsequence("aaaaaa", "bbaaaa"));
    }
}
