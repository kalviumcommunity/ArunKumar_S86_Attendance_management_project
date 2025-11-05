package com.school;

public class Staff extends Person {
    private String role;

    // Constructor matching Main.java usage: Staff(int id, String name, String role)
    public Staff(int id, String name, String role) {
        super(id, name);
        this.role = role;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Staff, Position: " + role);
    }
}
