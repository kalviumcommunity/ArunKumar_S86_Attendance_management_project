package com.school;

public class Student extends Person implements Storable  {
    private String gradeLevel;

    // Constructor matching Main.java usage: Student(int id, String name, String gradeLevel)
    public Student(int id, String name, String gradeLevel) {
        super(id, name);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Student, Grade Level: " + gradeLevel);
    }
    
    @Override
    public String toDataString() {
        return id + "," + name + "," + gradeLevel;
    }
}
