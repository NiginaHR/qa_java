package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)

public class TestFeline {

private final int kittensCount;

 public  TestFeline(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittens() {
        return new Object[][]{
                {1},
                {3},
                {5}

        };
    }

    @Test
    public void getKittensCount()  {

        Feline feline=new Feline();


        int actualResult = feline.getKittens(kittensCount);
        assertEquals(kittensCount, actualResult);


    }

    @Test
    public void ShowGetKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }


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



}

