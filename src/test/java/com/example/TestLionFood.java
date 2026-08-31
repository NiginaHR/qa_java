package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

 class TestLionFood {

    @Mock
    private Feline feline;

    @Test
    void isGetFood() throws Exception {
        when(feline.getFood("Хищник")).thenReturn((List.of("Кошачьи")));
        Lion lion = new Lion(feline);

        List<String> actualResult = lion.getFood();
        assertEquals(List.of("Кошачьи"), actualResult);
        verify(feline, times(1)).getFood("Хищник");


    }
}