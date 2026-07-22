package com.example.project01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void performsArithmeticOperations() {
        System.out.println("Running calculator arithmetic tests...");
        assertEquals(7.0, Calculator.add(3, 4));
        assertEquals(-1.0, Calculator.subtract(3, 4));
        assertEquals(12.0, Calculator.multiply(3, 4));
        assertEquals(0.75, Calculator.divide(3, 4));
        assertEquals(3.0, Calculator.modulo(15, 4));
        System.out.println("Calculator arithmetic tests passed.");
    }

    @Test
    void returnsZeroWhenDividingByZero() {
        System.out.println("Running calculator zero-division tests...");
        assertEquals(0.0, Calculator.divide(10, 0));
        assertEquals(0.0, Calculator.modulo(10, 0));
        System.out.println("Calculator zero-division tests passed.");
    }
}