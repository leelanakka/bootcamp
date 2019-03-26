package com.step.bootcamp.bagAndBall;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


class BagTest {
    @Test
    void shouldAddBallsToBag() {
        Ball blueBall = new Ball("blue");
        Bag bag = new Bag();
        bag.add(blueBall);
        Map<Ball, Integer> expected = new HashMap<>();
        expected.put(blueBall, 1);
    }

    @Test
    void shouldReturnTrueIfTheBagContainsLessThan12Balls() {
        Ball greenBall = new Ball("green");
        Bag bag = new Bag();
        bag.add(greenBall);
//        Assertions.assertTrue(bag.);
    }
}