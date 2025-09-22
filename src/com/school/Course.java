package com.school;

public class Course {
    private static int idCounter = 1;

    private int courseId;
    private String courseName;

    public Course(String courseName) {
        this.courseId = idCounter++;
        this.courseName = courseName;
    }

    // ✅ Getters
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}
