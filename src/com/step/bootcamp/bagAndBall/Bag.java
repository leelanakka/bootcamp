package com.step.bootcamp.bagAndBall;

class Bag {
    private Balls ballDetails;

    Bag() {
        this.ballDetails = new Balls();
    }

    void add(Ball ball) {
        if (isAddable(ball)) {
            ballDetails.add(ball);
        }
    }

    boolean isAddable(Ball ball) {
        return this.ballDetails.balls.size() <= 11;
    }
}
