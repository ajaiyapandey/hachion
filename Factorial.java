public class Factorial {
    
    // Method to calculate factorial using recursion
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
    
    // Method to calculate factorial using iteration
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
    
    // Method to display factorial
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

