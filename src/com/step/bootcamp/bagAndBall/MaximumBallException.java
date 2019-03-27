package com.step.bootcamp.bagAndBall;

class MaximumBallException extends TooManyBallsException {
    MaximumBallException() {
        super("you can't add more balls the bag is filled");
    }
}
