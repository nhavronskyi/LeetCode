package easy;

import org.example.easy.SmallestEvenMultiple;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallestEvenMultipleTest {
    @Test
    public void test(){
        SmallestEvenMultiple smallestEvenMultiple = new SmallestEvenMultiple();

        Assertions.assertEquals(10, smallestEvenMultiple.solution(5));
        Assertions.assertEquals(6, smallestEvenMultiple.solution(6));
        Assertions.assertEquals(154, smallestEvenMultiple.solution(77));
    }
}
