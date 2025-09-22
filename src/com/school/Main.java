package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Courses
        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        // Attendance log
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // ✅ Creating Attendance Records
        attendanceLog.add(new AttendanceRecord(student1.getStudentId(), course1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(student2.getStudentId(), course2.getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(student1.getStudentId(), course2.getCourseId(), "Holiday")); // invalid

        // ✅ Display Records
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
