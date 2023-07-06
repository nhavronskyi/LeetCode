package easy;

import org.example.easy.LongestCommonPrefix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {
    private final LongestCommonPrefix prefix = new LongestCommonPrefix();

    @Test
    public void test1(){
        Assertions.assertEquals("fl",prefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
    @Test
    public void test2(){
        Assertions.assertEquals("",prefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
