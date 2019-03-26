package com.step.bootcamp.bagAndBall;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {
    @Test
    void shouldReturnTrueIfBothBallsAreSameColour() {
        Ball green = new Ball("Green");
        Ball green1 = new Ball("Green");
        assertEquals(green,green1);
    }
}