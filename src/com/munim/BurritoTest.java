package com.munim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BurritoTest {
    @Test

        void testBurritoPrice() {

        double price = Burrito.getPrice();
        
        assertEquals(7.0, price, 0.001, "The getPrice method should return the current set price.");
    }


}