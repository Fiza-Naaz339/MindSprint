package com.mindsprint.project1.oops;

public class Students {
    private String name;
    private int[] grades;

    public Students(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Average Grade: " + calculateAverage());
    }

    public static void main(String[] args) {
        int[] grades = {85, 90, 78, 92, 88};
        Students students = new Students("Maya", grades);
        students.displayInfo();
    }
}

