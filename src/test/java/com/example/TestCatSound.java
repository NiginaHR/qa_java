package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)

 class TestCatSound {

    @Mock
    private Feline feline;

    @Test

        public void showGetSound(){

    Cat cat = new Cat(feline);

assertEquals("Мяу", cat.getSound());
}
}