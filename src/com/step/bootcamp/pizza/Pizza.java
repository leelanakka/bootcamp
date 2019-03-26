package com.step.bootcamp.pizza;

//todo builder pattern
class Pizza {
    private final double basePrice;
    private Toppings toppings;

    Pizza() {
        this.basePrice = 50;
        this.toppings = new Toppings();
    }

    double calculateTotalPrice() {
        return this.basePrice + this.toppings.calculateTotalPrice();
    }

    void add(Topping topping) {
        this.toppings.add(topping);
    }

    Description provideDescription() {
        return null;
    }
}
