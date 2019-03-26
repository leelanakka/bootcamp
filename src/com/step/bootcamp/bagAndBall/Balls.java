package com.step.bootcamp.bagAndBall;

import java.util.HashMap;

class Balls {
    HashMap<Ball, Integer> balls;

    Balls() {
        this.balls = new HashMap<>();
    }

    void add(Ball ball) {
        if (!this.balls.containsKey(ball)) {
            balls.put(ball, 1);
        }
        int noOfBalls = balls.get(ball);
        balls.put(ball, noOfBalls + 1);
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
