package com.school;

public class Student extends Person implements Storable {
    private String course;

    public Student(int id, String name, String course) {
        super(id, name);  // ✅ now valid
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student ID: " + getId() + ", Name: " + getName() + ", Course: " + course);
    }

    @Override
    public String toDataString() {   // ✅ required by FileStorageService
        return getId() + "," + getName() + "," + course;
    }
}
