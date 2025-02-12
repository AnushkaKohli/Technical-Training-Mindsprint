package com.mindsprint.project1.Assessment;

import java.util.Scanner;

public class Sorting {
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
        
        // Bubble Sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted Array: ");
        for (int num: arr)
            System.out.print(num + ", ");
    }
}
