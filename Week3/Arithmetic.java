package Week3;
//Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement.

import java.util.Scanner;
    
    public class Arithmetic {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Input first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
    
            // Input second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
    
            // Input operator
            System.out.print("Enter the operator (+, -, , /): ");
            char operator = scanner.next().charAt(0);
    
            double result;
    
            // Perform arithmetic operation based on the operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '^':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator");
            }
    
            scanner.close();
    }
}