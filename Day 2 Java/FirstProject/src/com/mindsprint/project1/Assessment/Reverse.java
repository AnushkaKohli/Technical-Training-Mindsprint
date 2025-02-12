package com.mindsprint.project1.Assessment;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the " + (i+1) + "th number: ");
            arr[i] = scn.nextInt();
        }

        System.out.print("Original Array: ");
        for (int num: arr)
            System.out.print(num + ", ");

        // Reversing
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println();
        System.out.print("Reversed Array: ");
        for (int num: arr)
            System.out.print(num + ", ");
    }
}
