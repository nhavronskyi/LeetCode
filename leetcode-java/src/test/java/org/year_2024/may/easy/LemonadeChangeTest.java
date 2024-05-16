package org.year_2024.may.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class LemonadeChangeTest {

    public static Stream<Arguments> argsTrue() {
        return Stream.of(
                arguments(new int[]{5, 5, 5, 10, 20}),
                arguments(new int[]{5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5})
        );
    }

    @ParameterizedTest
    @MethodSource("argsTrue")
    void testIfSellerCanProvideChange(int[] input) {
        boolean actual = LemonadeChange.lemonadeChange(input);
        Assertions.assertTrue(actual);
    }

    public static Stream<Arguments> argsFalse() {
        return Stream.of(arguments(new int[]{5, 5, 10, 10, 20}));
    }

    @ParameterizedTest
    @MethodSource("argsFalse")
    void testIfSellerCanNotProvideChange(int[] input) {
        boolean actual = LemonadeChange.lemonadeChange(input);
        Assertions.assertFalse(actual);
    }

}