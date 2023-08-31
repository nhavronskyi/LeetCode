package year_2023.july.medium;

import org.example.year_2023.july.medium.ProductOfArrayExceptSelf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductOfArrayExceptSelfTest {
    private final ProductOfArrayExceptSelf product = new ProductOfArrayExceptSelf();

    @Test
    public void positive() {
        int[] test = {1, 2, 3, 4};
        int[] ans = {24, 12, 8, 6};
        Assertions.assertArrayEquals(ans, product.productExceptSelf(test));
    }

    @Test
    public void mixed() {
        int[] test = {-1, 1, 0, -3, 3};
        int[] ans = {0, 0, 9, 0, 0};
        Assertions.assertArrayEquals(ans, product.productExceptSelf(test));
    }
}
