package com.mindsprint.project1.Arrays;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[5];
        String[] names = {"test1", "test2", "test3"};
        System.out.println(names[0]); //Accessing direct element

        // Accessing using for loop
        System.out.println("Accessing using for loop");
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i]);

        // Use for each loop
        System.out.println("Accessing using for each loop");
        for (String name: names)
            System.out.println(name);

        System.out.println("Store values in array using loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + i + "th number: ");
            arr[i] = scn.nextInt();
        }
        for(int num:arr)
            System.out.println(num);
    }
}
