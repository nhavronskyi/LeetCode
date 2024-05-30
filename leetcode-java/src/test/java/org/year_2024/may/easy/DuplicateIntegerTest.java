package org.year_2024.may.easy;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DuplicateIntegerTest {

    public Stream<Arguments> trueArgs() {
        return Stream.of(
                Arguments.arguments((Object) new int[]{1, 2, 3, 3})
        );
    }

    public Stream<Arguments> falseArgs() {
        return Stream.of(
                Arguments.arguments((Object) new int[]{1, 2, 3, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("trueArgs")
    void trueTest(int[] args) {
        assertTrue(DuplicateInteger.hasDuplicate(args));
    }

    @ParameterizedTest
    @MethodSource("falseArgs")
    void falseTest(int[] args) {
        assertFalse(DuplicateInteger.hasDuplicate(args));
    }
}