package com.step.bootcamp.bagAndBall;

import java.util.HashMap;

public class Validations {
    private HashMap<String, Validator> allValidations;

    public Validations() {
        this.allValidations = new HashMap<>();
        allValidations.put("Green", new GreenBallValidator());
        allValidations.put("Red", new RedBallValidator());
        allValidations.put("Yellow", new YellowBallValidator());
    }

}
