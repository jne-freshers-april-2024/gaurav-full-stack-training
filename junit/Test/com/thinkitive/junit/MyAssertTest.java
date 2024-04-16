package com.thinkitive.junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



class MyAssertTest {
    List<String> todos = Arrays.asList("SpringBoot","React", "NextJS");
    @Test
    void test(){
        boolean test = todos.contains("React");
        boolean test2 = todos.contains("SpringBoot");
//        assertEquals(true, test);
        assertTrue(test);
        assertTrue(test2);
        // assertNull, assertNotNull
        assertArrayEquals(new int[] {1,2}, new int[] {1, 2});
        assertEquals(3, todos.size(), "Something error");
    }
}