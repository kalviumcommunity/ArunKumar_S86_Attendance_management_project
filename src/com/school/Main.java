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
        regService.createCourse(301, "Math");
        regService.createCourse(302, "Science");

        displaySchoolDirectory(regService);

        attendanceService.markAttendance(1, 301, "Present");
        attendanceService.markAttendance(2, 302, "Absent");
        attendanceService.markAttendance(1, 302, "Present");

        attendanceService.displayAttendanceLog();

        regService.saveAllRegistrations();
        attendanceService.saveAttendanceData();
    }
}
