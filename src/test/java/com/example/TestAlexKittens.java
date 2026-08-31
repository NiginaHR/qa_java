package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class TestAlexKittens {
    @Test

    void isKittensCountIs0() throws Exception {

        Alex alex=new Alex(new Feline());


        int actualResult = alex.getKittens();
        assertEquals(0, actualResult);


    }
}
