package org.example;

import org.junit.jupiter.api.*;

public class CalciTest {
    private Calculator calc;
    @BeforeEach
    public void setUp(){
        calc = new Calculator();
    }
    @AfterEach
    public void tearDown(){
        calc = null;
    }
    @Test
    public void addTest(){
        Assertions.assertEquals(10,calc.add(4,6));
        Assertions.assertEquals(-2,calc.add(4,-6));
        Assertions.assertNotEquals(0,calc.add(4,6));
    }
    @Test
    public void subTest(){
        Assertions.assertEquals(2, calc.sub(6, 4));
        Assertions.assertEquals(10, calc.sub(4, -6));
        Assertions.assertNotEquals(0, calc.sub(6, 4));
    }

    @Test
    public void mulTest(){
        Assertions.assertEquals(24, calc.mul(6, 4));
        Assertions.assertEquals(-24, calc.mul(6, -4));
        Assertions.assertNotEquals(0, calc.mul(6, 4));
    }
    @Disabled
    @Test
    public void divTest(){
        Assertions.assertEquals(2, calc.div(8, 4));
        Assertions.assertEquals(-2, calc.div(8, -4));
        Assertions.assertNotEquals(0, calc.div(8, 4));
    }
}
