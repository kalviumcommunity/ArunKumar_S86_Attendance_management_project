package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Persons
        Student student1 = new Student("Alice", "10th Grade");
        Teacher teacher1 = new Teacher("Mr. Smith", "Math");
        Staff staff1 = new Staff("Mrs. Johnson", "Librarian");

        // Display details
        student1.displayDetails();
        teacher1.displayDetails();
        staff1.displayDetails();

        // Attendance Records using student.getId()
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(student1.getId(), 1, "Present"));

        System.out.println("\nAttendance Records:");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
