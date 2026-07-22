package com.example.project01;

/**
 * Calculates factorial values using recursive and iterative approaches.
 */
public class Factorial {

    /**
     * Calculates a factorial recursively.
     *
     * @param n the non-negative integer whose factorial is calculated
     * @return {@code n!}, or {@code -1} when {@code n} is negative
     */
    public static long factorialRecursive(int n) {
        if (n < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers!");
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    /**
     * Calculates a factorial iteratively.
     *
     * @param n the non-negative integer whose factorial is calculated
     * @return {@code n!}, or {@code -1} when {@code n} is negative
     */
    public static long factorialIterative(int n) {
        if (n < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers!");
            return -1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Prints the recursive and iterative factorial results for a number.
     *
     * @param n the number whose factorial is displayed
     */
    public static void displayFactorial(int n) {
        System.out.println("\n--- Factorial of " + n + " ---");
        long recursiveResult = factorialRecursive(n);
        if (recursiveResult != -1) {
            System.out.println("Recursive Method: " + n + "! = " + recursiveResult);
        }
        
        long iterativeResult = factorialIterative(n);
        if (iterativeResult != -1) {
            System.out.println("Iterative Method: " + n + "! = " + iterativeResult);
        }
    }

    /**
     * Runs a console demonstration with several factorial inputs.
     *
     * @param args command-line arguments, which are not used
     */
    public static void main(String[] args) {
        System.out.println("=== Factorial Calculator ===");
        
        // Test with different numbers
        displayFactorial(0);
        displayFactorial(1);
        displayFactorial(5);
        displayFactorial(10);
        displayFactorial(15);
        displayFactorial(20);
        
        // Test with negative number
        displayFactorial(-5);
    }
}