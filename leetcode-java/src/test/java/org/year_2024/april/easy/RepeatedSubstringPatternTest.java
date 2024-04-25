package org.year_2024.april.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RepeatedSubstringPatternTest {

    @ParameterizedTest
    @ValueSource(strings = {"abab", "abcabcabcabc", "bb", "abaababaab"})
    void trueRepeatedPattern(String input) {
        assertTrue(RepeatedSubstringPattern.repeatedSubstringPattern(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aba", "a"})
    void falseRepeatedPattern(String input) {
        assertFalse(RepeatedSubstringPattern.repeatedSubstringPattern(input));
    }
}