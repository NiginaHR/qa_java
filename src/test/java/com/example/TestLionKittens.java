package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

class TestLionKittens {
    @Mock
    private Feline feline;

    @Test
    void isKittensCountIs1() throws Exception {
        when(feline.getKittens()).thenReturn(1);

        Lion lion=new Lion(feline);
        int actualResult = lion.getKittens();
        assertEquals(1, actualResult);
        verify(feline, times(1)).getKittens();


    }

}
