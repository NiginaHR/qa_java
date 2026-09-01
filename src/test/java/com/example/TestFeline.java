package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestFelineException {

    @Test
    public void shouldThrowExceptionAnimalKind() {
        Feline feline = new Feline();

        assertThrows(Exception.class, () ->
        {
            feline.getFood("Неизвестный");

        });

    }
    @Test

    public void showGetFamily()  {

        Feline feline = new Feline();

        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test

    public void showEatMeat() throws Exception {

        Feline feline = new Feline();

        assertEquals( List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
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

