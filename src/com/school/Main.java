package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Physics");

        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s2.getStudentId(), c2.getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(s2.getStudentId(), c1.getCourseId(), "Late")); // invalid

        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        System.out.println("Attendance records processed successfully.");
        System.out.println("\n=== completed with part-4 ===");
    }
}
