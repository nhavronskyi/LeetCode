package easy.aug_2023;

import org.junit.Assert;
import org.junit.Test;

import static org.example.aug.easy.ExcelSheetColumnTitle.convertToTitle;

public class ExcelSheetColumnTitleTest {
    @Test
    public void test() {
        Assert.assertEquals("A", convertToTitle(1));
        Assert.assertEquals("AB", convertToTitle(28));
        Assert.assertEquals("ZY", convertToTitle(701));
    }
}
