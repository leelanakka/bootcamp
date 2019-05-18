package com.step.bootcamp.bagAndBall;

public class YellowBallValidator implements Validator {
    @Override
    public boolean isAddable(Ball thisBall, Balls ballDetails) throws TooManyYellowBallsException {
        if (thisBall.isOfColor(Colour.YELLOW)) {
            Integer yellowBalls = ballDetails.balls.get(Colour.YELLOW);
            if (yellowBalls > ballDetails.totalNumberOfBalls() * 0.4) {
                throw new TooManyYellowBallsException();
            }
        }
        return true;
    }
}
