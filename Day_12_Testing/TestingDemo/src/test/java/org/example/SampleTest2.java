package org.example;

import org.junit.jupiter.api.*;

public class SampleTest2 {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All Testcases");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("After All Testcases");
    }
    @BeforeEach
    public void SetUp(){
        System.out.println("DB Connected");
    }
    @AfterEach
    public void tearDown(){
        System.out.println("DB Disconnected");
    }
    @Test
    public void myTest1(){
        System.out.println("Test 1 Executed");
    }
    @Test
    public void myTest2(){
        System.out.println("Test 2 Executed");
    }
}
