package com.step.bootcamp.bagAndBall;

class TooManyRedBallsException extends TooManyBallsException {
    TooManyRedBallsException() {
        super("there are already enough red balls present");
    }

}
