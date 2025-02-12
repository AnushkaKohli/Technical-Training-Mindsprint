package com.mindsprint.project1.loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first number");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number");
            double num2 = scanner.nextDouble();
            System.out.println("Enter + for Addition\nEnter - for Subtraction\nEnter * for Multiplication\nEnter / for Division");
            String input = scanner.next();
            switch (input) {
                case "+":
                    System.out.println("Addition: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Subtraction: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Multiplication: " + (num1 * num2));
                    break;
                case "/":
                    System.out.println("Division: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Kindly enter correct operator");
            }
            System.out.println("Enter y to continue. Press any other key to exit.");
            String op = scanner.next();
            if (op.equals("y") || op.equals("Y"))
                    continue;
            break;
        }
    }
}
