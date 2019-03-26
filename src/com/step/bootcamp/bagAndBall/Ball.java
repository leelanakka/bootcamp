package com.step.bootcamp.bagAndBall;

class Ball {
    private String colour;

    Ball(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return colour.equals(ball.colour);
    }

}


//A bag can hold a maximum of 12 balls.
//
//Balls (blue, green, red or yellow in color) are added to the bag one at a time.
//No removals.
//
//There are some arbitrary rules for what can be in a bag.
//Max of 3 green balls.
//Red balls cannot be more than double the green balls at the time of addition.
//No limit on blue balls.
//Not more than 40% of the balls may be yellow.
//It should be possible to get a summary of the contents of the bag at any time.
