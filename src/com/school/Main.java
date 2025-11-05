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
        List<Student> allStudents = List.of(s1, s2);

        Teacher t1 = new Teacher(101, "Mr. Smith", "Mathematics Department");
        Staff st1 = new Staff(201, "Ms. Clara", "Administration");

        List<Person> schoolPeople = new ArrayList<>(List.of(s1, s2, t1, st1));
        displaySchoolDirectory(schoolPeople);

        Course c1 = new Course(301, "Math");
        Course c2 = new Course(302, "Science");
        List<Course> allCourses = List.of(c1, c2);

        FileStorageService storage = new FileStorageService();
        AttendanceService attendanceService = new AttendanceService(storage);

        attendanceService.markAttendance(s1, c1, "Present");
        attendanceService.markAttendance(2, 302, "Absent", allStudents, allCourses);
        attendanceService.markAttendance(1, 302, "Present", allStudents, allCourses);

        attendanceService.displayAttendanceLog();
        attendanceService.displayAttendanceLog(s1);
        attendanceService.displayAttendanceLog(c1);

        attendanceService.saveAttendanceData();
        storage.saveData(allStudents, "students.txt");
        storage.saveData(allCourses, "courses.txt");
    }
}
