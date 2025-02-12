package com.mindsprint.project1.basics;

public class TypeCasting {
    public static void main(String[] args) {
        short data = 10;
        float data1 = data; // implicit typecasting
        System.out.println("Data 1: " + data1);

        double info = 78.78;
        int info1 = (int) info; // explicit type casting
        System.out.println("Info 1: " + info1);

        char a = 'A';
        System.out.println("ASCII no.: " + (int)a);
        System.out.println("ASCII no.: " + (char)((int)a + 32));
    }
}
