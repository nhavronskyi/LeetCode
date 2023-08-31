package easy;

import org.example.july.db.SumMultiples;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumMultiplesTest {
    @Test
    public void tests() {
        SumMultiples multiples = new SumMultiples();

        int test1 = 7;
        int test2 = 10;
        int test3 = 9;

        int ans1 = 21;
        int ans2 = 40;
        int ans3 = 30;

        assertEquals(ans1, multiples.sumOfMultiples(test1));
        assertEquals(ans2, multiples.sumOfMultiples(test2));
        assertEquals(ans3, multiples.sumOfMultiples(test3));
    }
}
