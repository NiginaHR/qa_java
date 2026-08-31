package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

 class TestFelineException {

    @Test
    public void shouldThrowExceptionAnimalKind() {
        Feline feline = new Feline();

        assertThrows(Exception.class, () ->
        {
            feline.getFood("Неизвестный");

        });

    }
}

