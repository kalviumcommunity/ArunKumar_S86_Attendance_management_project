package com.school;

public class Teacher extends Person {
    private String department;

    public Teacher(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher ID: " + getId() + ", Name: " + getName() + ", Department: " + department);
    }
}
