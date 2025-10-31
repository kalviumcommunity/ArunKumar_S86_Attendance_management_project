package com.school;

import java.util.*;

public class Main {

    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("===== SCHOOL DIRECTORY =====");
        for (Person person : people) {
            person.displayDetails(); // polymorphic call
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student(1, "Alice", "CS101");
        Student s2 = new Student(2, "Bob", "CS102");

        // Create Teachers
        Teacher t1 = new Teacher(101, "Dr. Smith", "Computer Science");
        Teacher t2 = new Teacher(102, "Prof. Johnson", "Mathematics");

        // Create Staff
        Staff st1 = new Staff(201, "Mr. Ray", "Admin");
        Staff st2 = new Staff(202, "Mrs. Lee", "Library");

        // Add all to a single Person list
        List<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(s1);
        schoolPeople.add(s2);
        schoolPeople.add(t1);
        schoolPeople.add(t2);
        schoolPeople.add(st1);
        schoolPeople.add(st2);

        // Display directory using polymorphism
        displaySchoolDirectory(schoolPeople);

        // Create courses
        Course c1 = new Course(501, "Java Programming");
        Course c2 = new Course(502, "Data Structures");

        // Create Attendance Records using Student and Course objects
        AttendanceRecord ar1 = new AttendanceRecord(s1, c1, "Present");
        AttendanceRecord ar2 = new AttendanceRecord(s2, c2, "Absent");

        System.out.println("===== ATTENDANCE LOG =====");
        ar1.displayRecord();
        ar2.displayRecord();

        // Prepare to save data (filter only students)
        List<Student> studentsToSave = new ArrayList<>();
        for (Person p : schoolPeople) {
            if (p instanceof Student) {
                studentsToSave.add((Student) p);
            }
        }

        FileStorageService storageService = new FileStorageService();
storageService.saveData(studentsToSave, "students.txt");

    }
}
