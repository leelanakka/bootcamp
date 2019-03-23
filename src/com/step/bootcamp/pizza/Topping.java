package com.step.bootcamp.pizza;

enum Topping {
    VEGETABLE(20, "Vegetable"),
    CHICKEN(30, "Chicken"),
    MOZZARELLA(10, "Mozzarella"),
    TOMATO_SAUCE(5, "Tomato-Sauce"),
    EXTRA_CHEESE(25, "Extra-Cheese"),
    JALAPENO(40, "Jalapeno");
    private double price;
    private String name;

    Topping(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

