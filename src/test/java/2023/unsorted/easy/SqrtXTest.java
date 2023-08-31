package easy;

import org.example.july.db.SqrtX;
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
