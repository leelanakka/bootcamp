package com.step.bootcamp.bagAndBall;

public class GreenBallValidator implements Validator {
    @Override
    public boolean isAddable(Ball thisBall, Balls ballDetails) throws TooManyGreenBallsException {
        if (ballDetails.balls.size() >= 3) {
            throw new TooManyGreenBallsException();
        }
        return true;
    }
}
