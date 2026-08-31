package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
                {"Самка", false}
        };
    }

    @Test
    public void showGetHasMane() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);

    }


    @Test
    public void isKittensCountIs1() {
Lion lion=new Lion();
int count=1;
int actualResult=lion.getKittens(count);
        assertEquals(count, actualResult);


    }
}