package year_2023.unsorted.easy;

import org.example.year_2023.july.easy.SqrtX;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtXTest {
    @Test
    public void test1() {
        Assertions.assertEquals(2, SqrtX.mySqrt(4));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(2, SqrtX.mySqrt(8));
    }
}
