package com.mindsprint.project1.oops;

public class WaterBottle {
        int capacity;
        String color;
        String brand;

    public void setData(int capacity, String color, String brand) {
        this.capacity = capacity;
        this.color = color;
        this.brand = brand;
    }

     public void display() {
         System.out.println("-----------------------");
         System.out.println("Capacity: " + capacity + " ltr");
         System.out.println("Brand: " + brand);
         System.out.println("Color: " + color);
     }

    public static void main(String[] args) {
        WaterBottle b1 = new WaterBottle();
        b1.display(); // shows null
        WaterBottle b2 = new WaterBottle();
        b2.setData(1, "Purple", "Tupperware");
        b2.display();
    }
}
