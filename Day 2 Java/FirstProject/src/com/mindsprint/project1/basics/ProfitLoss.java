package com.mindsprint.project1.basics;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost price: ");
        int cp = scanner.nextInt();
        System.out.println("Enter the selling price: ");
        int sp = scanner.nextInt();
        String result = (sp > cp) ? "Profit: " + (sp - cp): "Loss: " + (cp - sp);
        System.out.println(result);
    }
}
