package com.step.bootcamp.bagAndBall;

public class RedBallValidator implements Validator {
    @Override
    public boolean isAddable(Ball thisBall, Balls ballDetails) throws TooManyRedBallsException {
        if (thisBall.isOfColor(Colour.RED)) {
            Integer noOfGreenBalls = ballDetails.balls.get(Colour.GREEN);
            if (ballDetails.balls.get(Colour.RED) > 2 * noOfGreenBalls) {
                throw new TooManyRedBallsException();
            }
        }
        return true;
    }
}
