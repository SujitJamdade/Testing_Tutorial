package com.example.Unit_testing_tutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    public void testAdd(){

        int result = cal.add(6,5);
        int expected = 11;

        Assertions.assertEquals(expected, result);

    }
}
