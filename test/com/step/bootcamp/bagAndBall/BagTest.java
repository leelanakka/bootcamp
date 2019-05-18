package com.step.bootcamp.bagAndBall;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


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
        assertTrue(bag.add(greenBall1));
    }

    @Test
    void shouldReturnTrueIfTheBagContainsLessThan12Balls() throws TooManyBallsException {
        Ball greenBall = Ball.greenBall();
        Bag bag = new Bag();
        bag.add(greenBall);
        assertTrue(bag.add(Ball.redBall()));
    }

    @Test
    void shouldThrowMaximumBallsExceededExceptionIfTheBagContains12Balls() throws TooManyBallsException {
        Bag bag = new Bag();
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
            bag.add(Ball.blueBall());
        }

        assertThrows(TooManyBallsException.class, () -> bag.add(Ball.redBall()));
    }

    @Test
    void shouldThrowTooManyRedBallsExceptionIfBagContainsMoreThanDoubleTheBallsOfGreen() throws TooManyBallsException {
        Bag bag = new Bag();
        Ball ball = Ball.greenBall();
        bag.add(ball);
        bag.add(Ball.redBall());
        bag.add(Ball.redBall());
//        bag.add(Ball.redBall());
//        bag.add(Ball.redBall());

        assertThrows(TooManyRedBallsException.class,()-> bag.add(Ball.redBall()));
    }
}