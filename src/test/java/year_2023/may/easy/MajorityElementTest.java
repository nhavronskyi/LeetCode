package year_2023.may.easy;

import org.example.year_2023.may.easy.MajorityElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {
    private final MajorityElement element = new MajorityElement();

    @Test
    public void small() {
        int[] nums = {3, 2, 3};
        Assertions.assertEquals(3, element.majorityElement(nums));
    }

    @Test
    public void big() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        Assertions.assertEquals(2, element.majorityElement(nums));
    }

}
