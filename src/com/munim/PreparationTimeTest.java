package com.munim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreparationTimeTest {
    @Test
    void testRecordTimeForNewItem() {
        PreparationTime.recordTime("Burrito", 2, 9.0);
        assertEquals(9.0, PreparationTime.prepTime.get("Burrito"), "Prep time should be exactly 9.0 for 2 Burrito.");
    }


}