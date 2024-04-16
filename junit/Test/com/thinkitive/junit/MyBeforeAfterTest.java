package com.thinkitive.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MyBeforeAfterTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("beforeAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Beforeeach");
    }
    @Test
    void test(){
        System.out.println("test1");
    }
    @Test
    void test2(){
        System.out.println("test2");
    }
    @Test
    void test3(){
        System.out.println("test3");
    }
    @AfterEach
    void afterEach(){
        System.out.println("AfterEach");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("AfterAll");
    }
}