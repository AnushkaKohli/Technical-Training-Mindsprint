package com.mindsprint.project1.oops;

public class Student {
    int id;
    String name;
    String email;
    String address;

//    Default Constructor
    public Student() {}
    public Student(String name, String email, String address) {
//        this((int) Math.round(Math.random()*10000), name, email, address);
        this.id = (int) Math.round(Math.random()*10000);
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Student(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student(2, "Anushka", "anushka@mindsprint.com", "Bengaluru");
        Student st3 = new Student("Alex", "alex@mindsprint.com", "London");
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
