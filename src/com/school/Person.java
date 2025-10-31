package com.school;

public class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {  // ✅ changed to take id also
        this.id = id;
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
