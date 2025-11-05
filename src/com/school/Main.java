package com.school;

import java.util.List;

public class Main {

    public static void displaySchoolDirectory(RegistrationService regService) {
        System.out.println("=== School Directory ===");
        for (Person person : regService.getAllPeople()) {
            person.displayDetails();
        }
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        FileStorageService storage = new FileStorageService();
        RegistrationService regService = new RegistrationService(storage);
        AttendanceService attendanceService = new AttendanceService(storage, regService);

        regService.registerStudent(1, "Alice", "10th Grade");
        regService.registerStudent(2, "Bob", "9th Grade");
        regService.registerTeacher(101, "Mr. Smith", "Mathematics Department");
        regService.registerStaff(201, "Ms. Clara", "Administration");

        regService.createCourse(301, "Math", 2);
        regService.createCourse(302, "Science", 1);

        displaySchoolDirectory(regService);

        Student s1 = regService.findStudentById(1);
        Student s2 = regService.findStudentById(2);
        Course c1 = regService.findCourseById(301);
        Course c2 = regService.findCourseById(302);

        regService.enrollStudentInCourse(s1, c1);
        regService.enrollStudentInCourse(s2, c1);
        regService.enrollStudentInCourse(s1, c2);
        regService.enrollStudentInCourse(s2, c2); // exceeds capacity

        System.out.println("\n=== Course Details After Enrollment ===");
        for (Course c : regService.getCourses()) {
            c.displayDetails();
        }

        attendanceService.markAttendance(1, 301, "Present");
        attendanceService.markAttendance(2, 301, "Absent");
        attendanceService.displayAttendanceLog();

        regService.saveAllRegistrations();
        attendanceService.saveAttendanceData();
    }
}
