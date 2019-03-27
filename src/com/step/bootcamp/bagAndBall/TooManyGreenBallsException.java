package com.step.bootcamp.bagAndBall;

class TooManyGreenBallsException extends TooManyBallsException {
    TooManyGreenBallsException() {
        super("there are already maximum balls present");
    }
}
