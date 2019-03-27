package com.step.bootcamp.bagAndBall;

class TooManyYellowBallsException extends TooManyBallsException {
    TooManyYellowBallsException( ) {
        super("there are already enough yellow balls");
    }
}
