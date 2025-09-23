package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "10th Grade"));
        students.add(new Student("Bob", "9th Grade"));

        
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Math"));
        courses.add(new Course("Science"));

        
        ArrayList<AttendanceRecord> records = new ArrayList<>();
        records.add(new AttendanceRecord(students.get(0).getId(), courses.get(0).getCourseId(), "Present"));
        records.add(new AttendanceRecord(students.get(1).getId(), courses.get(1).getCourseId(), "Absent"));

        
        FileStorageService storage = new FileStorageService();
        storage.saveData(students, "students.txt");
        storage.saveData(courses, "courses.txt");
        storage.saveData(records, "attendance_log.txt");
    }
}
