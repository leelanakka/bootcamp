package com.step.bootcamp.bagAndBall;

public interface Validator {
    boolean isAddable(Ball thisBall, Balls ballDetails) throws TooManyBallsException, TooManyGreenBallsException;
}
