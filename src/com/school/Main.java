package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("=== School Directory ===");
        for (Person person : people) {
            person.displayDetails();
        }
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice", "10th Grade");
        Student s2 = new Student(2, "Bob", "9th Grade");

        Teacher t1 = new Teacher(101, "Mr. Smith", "Mathematics Department");
        Staff st1 = new Staff(201, "Ms. Clara", "Administration");

        List<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(s1);
        schoolPeople.add(s2);
        schoolPeople.add(t1);
        schoolPeople.add(st1);

        displaySchoolDirectory(schoolPeople);

        Course c1 = new Course(301, "Math");
        Course c2 = new Course(302, "Science");

        List<AttendanceRecord> records = new ArrayList<>();
        records.add(new AttendanceRecord(s1, c1, "Present"));
        records.add(new AttendanceRecord(s2, c2, "Absent"));

        System.out.println("\n=== Attendance Log ===");
        for (AttendanceRecord r : records) {
            r.displayRecord();
        }

        FileStorageService storage = new FileStorageService();

        List<Student> studentList = new ArrayList<>();
        for (Person p : schoolPeople) {
            if (p instanceof Student) {
                studentList.add((Student) p);
            }
        }

        storage.saveData(studentList, "students.txt");
        storage.saveData(List.of(c1, c2), "courses.txt");
        storage.saveData(records, "attendance_log.txt");
    }
}
