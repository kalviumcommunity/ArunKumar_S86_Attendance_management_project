package com.school;

public class Staff extends Person {
    private String role;

    public Staff(int id, String name, String role) {
        super(id, name);
        this.role = role;
    }

    @Override
    public void displayDetails() {
        System.out.println("Staff ID: " + getId() + ", Name: " + getName() + ", Role: " + role);
    }
}
