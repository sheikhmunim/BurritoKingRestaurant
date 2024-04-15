package com.munim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriesTest {
    @Test
    void toTestInventoryUpdate() {

        int initialInventory = 50;
        Fries.friesInventory = initialInventory; // Set up initial inventory


        int quantityToUpdate = 10;
        Fries.updateInventory(quantityToUpdate); // Call the method with a quantity for update


        int expectedInventory = initialInventory - quantityToUpdate;
        assertEquals(expectedInventory, Fries.friesInventory); // Assert that the inventory has been updated correctly
    }


    @Test
    void puttingQuantityShouldCookBatchOfNeededFries() {
        Fries.cookFries(10);
        assertEquals(10, Fries.friesInventory, "Inventory should match cooked fries for exact multiples of 5.");


    }


}

