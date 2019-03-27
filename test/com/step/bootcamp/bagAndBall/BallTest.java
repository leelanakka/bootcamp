package com.step.bootcamp.bagAndBall;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BallTest {
    @Test
    void shouldReturnTrueIfBothBallsAreSameColour() {
        Ball green = Ball.greenBall();
        Ball green1 = Ball.greenBall();
        assertEquals(green, green1);
    }
}