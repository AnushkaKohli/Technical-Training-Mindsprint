package com.mindsprint.project1.oopsProperties;

class Parent {
    public String name = "Anushka";
    public Parent() {
        System.out.println("Parent class constructor");
    }
    public void hello() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    public Child() {
        super(); // Initially calls parent class constructor automatically
        System.out.println("Child constructor");
    }

    public void print() {
        // Child can access properties of parent class
        System.out.println("Welcome " + name);
    }
}

//There can exist only a single public class
public class Inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.print();
        child.hello(); //Child can access parent class methods
        System.out.println(child.name); // direct access
    }
}
