package com.step.bootcamp.bagAndBall;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


class BagTest {
    @Test
    void shouldAddBallsToBag() throws TooManyBallsException {
        Ball blueBall = Ball.blueBall();
        Ball greenBall = Ball.greenBall();
        Ball greenBall1 = Ball.greenBall();
        Bag bag = new Bag();
        bag.add(blueBall);
        Map<Ball, Integer> expected = new HashMap<>();
        expected.put(blueBall, 1);
        bag.add(greenBall);
        bag.add(Ball.redBall());
        Assertions.assertTrue(bag.add(greenBall1));
    }

    @Test
    void shouldReturnTrueIfTheBagContainsLessThan12Balls() throws TooManyBallsException {
        Ball greenBall = Ball.greenBall();
        Bag bag = new Bag();
        bag.add(greenBall);
//        Assertions.assertTrue(bag.);
    }
}