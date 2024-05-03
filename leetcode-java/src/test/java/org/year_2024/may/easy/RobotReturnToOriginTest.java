package org.year_2024.may.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RobotReturnToOriginTest {
    @ParameterizedTest
    @ValueSource(strings = {"UD", "DU", "RL", "LR", "RLUURDDDLU"})
    void robotShouldReturnToOriginTest(String moves) {
        assertTrue(RobotReturnToOrigin.judgeCircle(moves));
    }

    @ParameterizedTest
    @ValueSource(strings = {"LL", "RR", "UU", "DD", "RD", "UL", "DURDLDRRLL", "RRDD"})
    void robotShouldNotReturnToOriginTest(String moves) {
        assertFalse(RobotReturnToOrigin.judgeCircle(moves));
    }
}