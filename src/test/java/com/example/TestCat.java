package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

 class TestCat {
    @Mock
    private Feline feline;
    @Test

    public void showGetEatMeat() throws Exception {

        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Cat cat = new Cat(feline);
        List<String> food = cat.getFood();

        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
        verify(feline, times(1)).eatMeat();
    }


    @Test

    public void showGetSound(){

        Cat cat = new Cat(feline);

        assertEquals("Мяу", cat.getSound());
    }
}

