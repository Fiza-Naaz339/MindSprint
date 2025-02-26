package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {

    public int add(int num1,int num2) {
        return num1 + num2;
    }
    @Test
    public void demoTest(){
        System.out.println("Test Executed");
//        Assertions.assertEquals(10,add(4,6));
        int actual = add(4,6);
        int expected = 10;
        Assertions.assertEquals(expected,actual);
    }
}
