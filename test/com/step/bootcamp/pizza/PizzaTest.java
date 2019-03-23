package com.step.bootcamp.pizza;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTest {

    @Test
    void shouldGiveTheTotalPrice() {
        Pizza pizza = new Pizza();
        assertEquals(50, pizza.calculateTotalPrice());
    }

    @Test
    void shouldGiveTheTotalPriceAfterAddingOneTopping() {

        Pizza pizza = new Pizza();
        pizza.add(Topping.CHICKEN);
        assertEquals(80, pizza.calculateTotalPrice());
    }

    @Test
    void shouldGiveTheTotalPriceAfterAddingMultipleToppings() {
        Pizza pizza = new Pizza();
        pizza.add(Topping.CHICKEN);
        pizza.add(Topping.JALAPENO);
        pizza.add(Topping.EXTRA_CHEESE);
        assertEquals(145, pizza.calculateTotalPrice());
    }

//    @Test
//    void shouldGiveTheDescription() {
//
//        Pizza pizza = new Pizza();
//        pizza.add(Topping.CHICKEN);
//
//        ArrayList<Topping> toppings = new ArrayList<>();
//        toppings.add(Topping.EXTRA_CHEESE);
//
//        Description description = new Description(toppings);
//        assertEquals(description,pizza.provideDescription());
//
//    }
}