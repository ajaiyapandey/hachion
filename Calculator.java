public class Calculator {
    
    // Addition
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    // Division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
    
    // Modulo
    public static double modulo(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a % b;
    }
    
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

