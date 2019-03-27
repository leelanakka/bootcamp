package com.step.bootcamp.bagAndBall;

class Ball {
    private Colour colour;

    private Ball(Colour colour) {
        this.colour = colour;
    }

    static Ball yellowBall() {
        return new Ball(Colour.YELLOW);
    }

    static Ball blueBall() {
        return new Ball(Colour.BLUE);
    }

    boolean isOfColor(Colour other) {
        return colour.equals(other);
    }

    Colour getColour() {
        return colour;
    }

    static Ball greenBall() {
        return new Ball(Colour.GREEN);
    }

    static Ball redBall() {
        return new Ball(Colour.RED);
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
