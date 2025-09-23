package com.school;

public class Course implements Storable {
    private static int idCounter = 1;

    private int courseId;
    private String courseName;

    public Course(String courseName) {
        this.courseId = idCounter++;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
     @Override
    public String toDataString() {
        return courseId + "," + courseName;
    }
}
