package com.school;

public class Teacher extends Person {
    private String subjectTaught;

    // Constructor matching Main.java usage: Teacher(int id, String name, String subjectTaught)
    public Teacher(int id, String name, String subjectTaught) {
        super(id, name);
        this.subjectTaught = subjectTaught;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Teacher, Subject: " + subjectTaught);
    }
}
