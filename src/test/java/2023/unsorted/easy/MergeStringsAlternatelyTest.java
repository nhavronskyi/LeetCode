package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.example.may.easy.MergeStringsAlternately.mergeAlternately;

public class MergeStringsAlternatelyTest {
    @Test
    public void test() {
        Assert.assertEquals("apbqcr", mergeAlternately("abc", "pqr"));
        Assert.assertEquals("apbqrs", mergeAlternately("ab", "pqrs"));
        Assert.assertEquals("apbqcd", mergeAlternately("abcd", "pq"));
        Assert.assertEquals("fcbe", mergeAlternately("fb", "ce"));
    }
}
