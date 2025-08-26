package com.school;

public class Course {
    private static int nextCourseIdCounter = 1;
    String courseId;
    String courseName;

    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    public void displayDetails() {
        System.out.println("Course ID: " + courseId + ", Name: " +courseName);
    }
}