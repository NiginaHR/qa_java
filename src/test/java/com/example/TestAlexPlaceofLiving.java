package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


 class TestAlexPlaceofLiving {

    @Test
    public void showPlaceOfLiving() throws Exception {

        Alex alex = new Alex(new Feline());

        String place = alex.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", place);
    }

}

