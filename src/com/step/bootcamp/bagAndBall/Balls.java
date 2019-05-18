package com.step.bootcamp.bagAndBall;

import java.util.HashMap;

class Balls {
    HashMap<Colour, Integer> balls;
    private int totalBalls;

    Balls() {
        this.balls = new HashMap<>();
        this.totalBalls = 0;
    }

    void add(Ball ball) {
        if (!this.balls.containsKey(ball.getColour())) {
            balls.put(ball.getColour(), 1);
        }
        int noOfBalls = balls.get(ball.getColour());
        balls.put(ball.getColour(), noOfBalls + 1);
        totalBalls++;
    }

    int totalNumberOfBalls() {
        return this.totalBalls;
    }

}

//A bag can hold a maximum of 12 balls.
//
//Balls (blue, green, red or yellow in color) are added to the bag one at a time.
//No removals.
//
//There are some arbitrary rules for what can be in a bag.
//Max of 3 green balls.
//Red balls cannot be more than double the green balls at the time of addition.
//No limit on blue balls.
//Not more than 40% of the balls may be yellow.
//It should be possible to get a summary of the contents of the bag at any time.
