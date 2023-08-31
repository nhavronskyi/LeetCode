package easy;

import org.example.june.easy.BuddyStrings;
import org.junit.Assert;
import org.junit.Test;

public class BuddyStringsTest {
    @Test
    public void trueTests() {
        Assert.assertTrue(BuddyStrings.buddyStrings("ab", "ba"));
        Assert.assertTrue(BuddyStrings.buddyStrings("aa", "aa"));
        Assert.assertTrue(BuddyStrings.buddyStrings("aaaaaaabc", "aaaaaaacb"));
        Assert.assertTrue(BuddyStrings.buddyStrings("abab", "abab"));
    }

    @Test
    public void falseTest() {
        Assert.assertFalse(BuddyStrings.buddyStrings("ab", "ab"));
    }
}
