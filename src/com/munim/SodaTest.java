package com.munim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SodaTest {
    @Test

    public void testForGettingName() {
        String result = Soda.getName();

        assertEquals("Soda", result, "The getName method should return 'Soda'.");
    }


}