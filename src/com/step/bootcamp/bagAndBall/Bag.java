package com.step.bootcamp.bagAndBall;

import java.util.ArrayList;

class Bag {
    private Balls ballDetails;
    private ArrayList<Validator> validations = new ArrayList<>();

    Bag() {
        this.ballDetails = new Balls();
        this.validations.add(new GreenBallValidator());
        this.validations.add(new YellowBallValidator());
        this.validations.add(new RedBallValidator());
    }

    boolean add(Ball ball) throws TooManyBallsException {
        if (!isAddable()) {
            throw new MaximumBallException();
        }

        for (Validator validation : validations) {
            validation.isAddable(ball, ballDetails);
        }
        ballDetails.add(ball);
        return true;
    }

    private boolean isAddable() {
        return this.ballDetails.balls.size() <= 11;
    }
}
