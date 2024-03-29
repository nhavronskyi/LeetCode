package year_2023.june.easy;

import org.example.year_2023.june.easy.AddBinary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddBinaryTest {
    private final AddBinary binary = new AddBinary();

    @Test
    public void test1() {
        Assertions.assertEquals("100", binary.addBinary("11", "1"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("10101", binary.addBinary("1010", "1011"));
    }
}
