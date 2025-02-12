package com.mindsprint.project1.Assessment;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scn.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scn.nextInt();
        String result = num1 > num2 ? num1 + " is greater than " + num2 : num2 + " is greater than " + num1;
        System.out.println(result);
    }
}
