package com.mindsprint.project1.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
//        int[][] arr = new int[3][];
        int[][] arr = {{1, 2, 3}, {4, 5, 6, 8}};
        System.out.println("For loop");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("For each loop");
        for (int[] row:arr) {
            for (int num: row)
                System.out.print(num + "\t");
            System.out.println();
        }
    }
}
