package com.mindsprint.project1.basics;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println(("Enter the age: "));
        int age = scanner.nextInt();

        String result = (age > 18) ? "Valid for vote" : "Not valid for vote";
        System.out.println(result);
    }
}
