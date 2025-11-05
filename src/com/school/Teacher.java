package com.school;

public class Teacher extends Person implements Storable {
    private String department;

    public Teacher(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher: " + getName() + " (ID: " + getId() + "), Department: " + department);
    }

    @Override
    public String toDataString() {
        return getId() + "," + getName() + "," + department;
    }
}
