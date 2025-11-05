package com.school;

public class Person {
    protected int id;
    protected String name;

    // New constructor that accepts an explicit id and name to match usages in Main
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Backwards-compatible constructor that auto-assigns an id when only name is provided
    public Person(String name) {
        this.id = -1; // unknown / auto-assigned
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
