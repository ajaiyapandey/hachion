package com.example.project01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    @Test
    void calculatesFactorialWithBothImplementations() {
        System.out.println("Running factorial calculation tests...");
        assertEquals(1, Factorial.factorialRecursive(0));
        assertEquals(1, Factorial.factorialIterative(0));
        assertEquals(120, Factorial.factorialRecursive(5));
        assertEquals(120, Factorial.factorialIterative(5));
        assertEquals(3628800, Factorial.factorialRecursive(10));
        assertEquals(3628800, Factorial.factorialIterative(10));
        System.out.println("Factorial calculation tests passed.");
    }

    @Test
    void returnsNegativeOneForNegativeInput() {
        System.out.println("Running factorial negative-input tests...");
        assertEquals(-1, Factorial.factorialRecursive(-5));
        assertEquals(-1, Factorial.factorialIterative(-5));
        System.out.println("Factorial negative-input tests passed.");
    }
}