package org.example;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }
    @AfterEach
    public void tearDown() {
        calc = null;
    }

    @Test
    public void addTest() {
        Assertions.assertEquals(10, calc.add(4, 6));
        Assertions.assertEquals(-2, calc.add(4, -6));
        Assertions.assertNotEquals(0, calc.add(4, -6));
    }
    @Test
    public void subTest() {
        Assertions.assertEquals(10, calc.sub(20, 10));
        Assertions.assertEquals(-8, calc.sub(-2, 6));
        Assertions.assertNotEquals(10, calc.sub(10, -20));
    }
    @Test
    public void mulTest() {
        Assertions.assertEquals(24, calc.mul(4, 6));
        Assertions.assertEquals(-24, calc.mul(4, -6));
        Assertions.assertNotEquals(0, calc.mul(4, -6));
    }
    @Disabled
    @Test
    public void divTest() {
        Assertions.assertEquals(10, calc.div(20, 2));
        Assertions.assertEquals(-2, calc.div(-6, 3));
        Assertions.assertNotEquals(0, calc.div(10, -6));
    }
}
