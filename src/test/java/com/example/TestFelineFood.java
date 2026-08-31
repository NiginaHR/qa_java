package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)

 class TestFelineFood {


             @Test

        public void showEatMeat() throws Exception {

            Feline feline = new Feline();

            assertEquals( List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
        }



}
