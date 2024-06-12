package com.example.Unit_testing_tutorial;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    Calculator cal = new Calculator();

    @BeforeAll
    public static  void setup(){
        System.out.println("This is executed before the test class is loaded");
    }

    @BeforeEach
    public void beforeEveryTest(){
        System.out.println("This is executed before the every test");
    }

    @Test
    public void testAdd(){
        System.out.println("Test 1");
        int result = cal.add(6,5);
        int expected = 11;

        Assertions.assertEquals(expected, result);

    }

    @Test  // When input is odd number while testing isSum
    public void testIsEvenWhenInputIsOdd(){
        System.out.println("Test 2");
        boolean actual = cal.isEven(23);
        Assertions.assertFalse(actual);
    }

    @Test  // When input is even number while testing isSum
    public void testIsEvenWhenInputIsEven(){
        System.out.println("Test 3");
        boolean actual = cal.isEven(24);
        Assertions.assertTrue(actual);
    }

    @Test // testing for multiply of 2 number
    public void testMultiply(){
        System.out.println("Test 4");
        int actual = cal.multiply(3,4);
        int expected = 12;
        Assertions.assertEquals(expected,actual);
    }

    @Test // testing for subtraction of 2 number
    public void testSubtract(){
        System.out.println("Test 5");
        int actual = cal.subtract(3,4);
        int expected = -1;
        Assertions.assertEquals(expected,actual);
    }

    @Test // testing the sum of multiple number
    public void testSumOfMultipleNo(){
        System.out.println("Test 6");
        int actual = cal.SumOfMultipleNo(1,2,3,4,5,6);
        int expected = 21;
        Assertions.assertEquals(expected,actual);
    }

    @AfterAll
    public static void cleanup(){
        System.out.println("This is executed after the test class is loaded");
    }
}


