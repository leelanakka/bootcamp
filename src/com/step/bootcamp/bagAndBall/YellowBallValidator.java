package com.step.bootcamp.bagAndBall;

import java.util.Map;

public class YellowBallValidator implements Validator {
    @Override
    public boolean isAddable(Ball thisBall, Balls ballDetails) throws TooManyYellowBallsException {
        if (thisBall.isOfColor(Colour.YELLOW)) {
            Integer totalBalls = 0;
            for (Map.Entry<Colour, Integer> ballIntegerEntry : ballDetails.balls.entrySet()) {
                totalBalls += ballIntegerEntry.getValue();
            }
            Integer yellowBalls = ballDetails.balls.get(Colour.YELLOW);
            if (yellowBalls > totalBalls * 0.4) {
                throw new TooManyYellowBallsException();
            }
        }
        return true;
    }
}
