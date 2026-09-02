package com.example;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

@RunWith(Parameterized.class)

public class TestLion {
    private final String sex;

    private final boolean expected;


    public TestLion(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters

    public static Object[][] getHasMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},

        };
    }

    @Test
    public void showGetHasMane() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);

    }

    @Test
    public void isGetFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);

        when(feline.getFood("Хищник")).thenReturn((List.of("Кошачьи")));
        Lion lion = new Lion(feline);

        List<String> actualResult = lion.getFood();
        Assertions.assertEquals(List.of("Кошачьи"), actualResult);
        verify(feline, times(1)).getFood("Хищник");


    }
    @Test
    public void shouldThrowException() {

        assertThrows(IllegalArgumentException.class, () ->
        {
            new Lion("Неизвестный");

        });

    }
    @Test

    public void isKittensCountIs1() throws Exception {
        Feline feline = Mockito.mock(Feline.class);

        when(feline.getKittens()).thenReturn(1);

        Lion lion=new Lion(feline);
        int actualResult = lion.getKittens();
        Assertions.assertEquals(1, actualResult);
        verify(feline, times(1)).getKittens();


    }

}

