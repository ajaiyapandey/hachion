package com.example.project01;

/**
 * Provides basic arithmetic operations and a console demonstration.
 */
public class Calculator {

    /**
     * Adds two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of {@code a} and {@code b}
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first number.
     *
     * @param a the number to subtract from
     * @param b the number to subtract
     * @return the difference between {@code a} and {@code b}
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the product of {@code a} and {@code b}
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second number.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the quotient, or {@code 0} when {@code b} is zero
     */
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    /**
     * Calculates the remainder after dividing the first number by the second.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the remainder, or {@code 0} when {@code b} is zero
     */
    public static double modulo(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a % b;
    }

    /**
     * Runs a console demonstration of the calculator operations.
     *
     * @param args command-line arguments, which are not used
     */
    public static void main(String[] args) {
        System.out.println("=== Simple Calculator ===\n");
        
        double num1 = 15;
        double num2 = 4;
        
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println();
        
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtract(num1, num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiply(num1, num2));
        System.out.println("Division: " + num1 + " / " + num2 + " = " + divide(num1, num2));
        System.out.println("Modulo: " + num1 + " % " + num2 + " = " + modulo(num1, num2));
    }
}