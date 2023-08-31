package year_2023.aug.easy;

import org.example.year_2023.aug.easy.ExcelSheetColumnNumber;
import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetColumnNumberTest {
    @Test
    public void test() {
        Assert.assertEquals(1, ExcelSheetColumnNumber.titleToNumber("A"));
        Assert.assertEquals(2, ExcelSheetColumnNumber.titleToNumber("B"));
        Assert.assertEquals(701, ExcelSheetColumnNumber.titleToNumber("ZY"));
    }
}
