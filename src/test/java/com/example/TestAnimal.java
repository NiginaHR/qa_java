package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)

public class TestAnimal {

    private final String animalKind;
    private final  List <String> expectedFood;

    public TestAnimal(String animalKind,  List <String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;

    }

    @Parameterized.Parameters

    public static Object[][] getAnimalsFood() {
        return new Object[][]{
        {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        {"Травоядное", List.of("Трава", "Различные растения")}
    };
    }

    @Test

    public void showGetAnimalsFood() throws Exception {

        Animal animal=new Animal();
        List <String> actual = animal.getFood(animalKind);
       assertEquals(expectedFood, actual);

    }

        @Test

    public void showGetAnimalFamily()  {

        Animal animal = new Animal();

        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }






    @Test
    public void testInvalid() {
        Animal animal = new Animal();
        assertThrows(Exception.class, () -> {
            animal.getFood("Неизвестно");
        });
    }
}

