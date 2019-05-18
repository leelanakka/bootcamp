package com.step.bootcamp.bagAndBall;

public class RedBallValidator implements Validator {
    @Override
    public boolean isAddable(Ball thisBall, Balls ballDetails) throws TooManyRedBallsException {
        if (thisBall.isOfColor(Colour.RED)) {
            Integer noOfGreenBalls = ballDetails.balls.get(Colour.GREEN);
            System.out.println(noOfGreenBalls+"=============");
            System.out.println(ballDetails.balls.getOrDefault(Colour.RED, 0));
            if (ballDetails.balls.getOrDefault(Colour.RED, 0) > 2 * noOfGreenBalls) {
                throw new TooManyRedBallsException();
            }
        }
        return true;
    }
}
