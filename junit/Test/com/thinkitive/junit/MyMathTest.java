package com.thinkitive.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
    private MyMath math = new MyMath();
    @Test
    void calculateSum_ThreeMemberArray(){

        assertEquals(6, math.calculation(new int[]{1, 2, 3}));
        // Absence of failure is success
        // Test Condition or Assert
    } @Test
    void calculateSum_ZeroLengthArray(){

        assertEquals(0, math.calculation(new int[]{}));
        // Absence of failure is success
        // Test Condition or Assert
    }

}