package com.mindsprint.project1.Assessment;

public class Student {
    String name;
    int[] grades = new int[5];

    // Default Constructor
    public Student() {
    }

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public float calculateAverage() {
        int sum = 0;
        for (int grade: grades)
            sum += grade;
        return (float)(sum / grades.length);
    }

    public void displayInfo() {
        float avg = calculateAverage();
        System.out.println("Student Name: " + name);
        System.out.println("Student Grades: ");
        for (int grade: grades)
            System.out.println(grade + " ");
        System.out.println("Average Grade: " + avg);
    }

    public static void main(String[] args) {
        int[] grades =  {95, 92, 99, 98, 100};
        Student st = new Student("Anushka", grades);
        st.displayInfo();
    }
}
