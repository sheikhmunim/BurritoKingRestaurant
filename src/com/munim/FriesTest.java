package com.munim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriesTest {
    @Test
    void testUpdateInventory() {
        // Set up initial inventory
        int initialInventory = 50;
        Fries.friesInventory = initialInventory;

        // Call the method with a quantity to update
        int quantityToUpdate = 10;
        Fries.updateInventory(quantityToUpdate);

        // Assert that the inventory has been updated correctly
        int expectedInventory = initialInventory - quantityToUpdate;
        assertEquals(expectedInventory, Fries.friesInventory);
    }
}

