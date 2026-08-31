package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)

 class TestFelineFamily {

    @Test

    public void showGetFamily()  {

        Feline feline = new Feline();

        assertEquals("Кошачьи", feline.getFamily());
    }

}
