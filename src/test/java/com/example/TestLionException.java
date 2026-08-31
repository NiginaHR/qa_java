package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

 class TestLionException {

    @Test
    public void shouldThrowException() {

        assertThrows(IllegalArgumentException.class, () ->
        {
            new Lion("Неизвестный");

        });

    }
}