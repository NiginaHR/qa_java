package com.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


 class TestFelineKittens {

    @Test
    void isKittensCountIs1()  {

        Feline feline=new Feline();


        int actualResult = feline.getKittens();
        assertEquals(1, actualResult);


}
    @Test
    void isKittensCountIs3() {
        Feline feline = new Feline();
        int actualResult = feline.getKittens(3);
        assertEquals(3, actualResult);
    }
}