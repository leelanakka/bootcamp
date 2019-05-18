package com.step.bootcamp.bagAndBall;

public class GreenBallValidator implements Validator {
    @Override
    public boolean isAddable(Ball thisBall, Balls ballDetails) throws TooManyGreenBallsException {
        System.out.println(ballDetails.balls.get(Colour.GREEN)+"----------=========------");
        if (ballDetails.balls.getOrDefault(Colour.GREEN, 0) >= 3) {
            throw new TooManyGreenBallsException();
        }
        return true;
    }
}
