package com.mindsprint.project1.oops;

public class EmployeeUsage {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John Doe", 520000);
        System.out.println(e1);
        Employee e2 = new Employee();
        e2.setId(1001);
        e2.setName("Alex");
        e2.setSalary(1000000);
        System.out.println("ID: " + e2.getId() + " Name: " + e2.getName() + " Salary: " + e2.getSalary());
    }
}
