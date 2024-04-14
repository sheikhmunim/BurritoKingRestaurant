package com.munim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MealsTest {
    @Test
    void getPriceShouldGiveDiscountedPrice() {
        Meals meals = new Meals(); // Create an instance of Meals
        assertEquals(10.5, meals.getPrice());
    }
}

