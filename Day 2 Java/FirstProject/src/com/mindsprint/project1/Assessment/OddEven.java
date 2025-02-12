package com.mindsprint.project1.Assessment;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        String result = num % 2 == 0 ? num + " is Even" : num + " is Odd";
        System.out.println(result);
    }
}
