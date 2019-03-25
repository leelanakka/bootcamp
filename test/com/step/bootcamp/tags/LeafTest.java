package com.step.bootcamp.tags;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeafTest {

    @Test
    void shouldRefreshTheGivenLeafComponent() {
        Leaf text = new Leaf("text");

        String expected = "Refreshing text";

        assertEquals(expected, text.refresh());
    }
}