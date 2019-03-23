package com.step.bootcamp.pizza;

import java.util.ArrayList;

class Toppings {
    private ArrayList<Topping> toppings = new ArrayList<>();
    private double totalPrice;

    Toppings() {
        this.totalPrice = 0;
    }

    void add(Topping topping) {
        toppings.add(topping);
    }

    double calculateTotalPrice() {
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }
}
