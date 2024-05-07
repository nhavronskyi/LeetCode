package org.year_2024.may.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RobotBoundedInCircleTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "GGLLGG",
            "GL",
            "LLGRL",
            "GLRLGLLGLGRGLGL",
            "RLLGGLRGLGLLLGRLRLRLRRRRLRLGRLLLGGL",
            "RLLGLRRRRGGRRRGLLRRR"})
    void testIfRobotBounded(String instructions) {
        assertTrue(RobotBoundedInCircle.isRobotBounded(instructions));
    }

    @ParameterizedTest
    @ValueSource(strings = {"GG"})
    void testIfRobotNotBounded(String instructions) {
        assertFalse(RobotBoundedInCircle.isRobotBounded(instructions));
    }

}