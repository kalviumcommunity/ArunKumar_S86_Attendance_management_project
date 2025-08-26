# Attendance Management Project

This is the initial setup for the Attendance Management System project.

## Structure
- `src/com/school/Main.java`: Contains the welcome messages Java program.

- ## Session 2: Core Domain Modelling
- Defined `Student` class with `studentId`, `name`, `setDetails()`, and `displayDetails()` method.
- Defined `Course` class with `courseId`, `courseName`, `setDetails()`, and `displayDetails()` method.
- Utilized arrays of objects in `Main.java` to manage and display multiple students and courses.
- Introduced basic usage of `this` keyword.

### How to Run
1. Navigate to the project root directory.
2. Compile: `javac src/com/school/Student.java src/com/school/Course.java src/com/school/Main.java` (or `javac src/com/school/*.java`)
3. Run: `java -cp src com.school.Main`

## Part 3: Constructor Initialization & Auto-ID Generation
- Added constructors in `Student` and `Course` classes.
- Implemented automatic unique ID generation using `private static` variables.
- Changed `Course`'s `courseId` to an `int` for easier auto-incrementation.
- Updated `Main.java` to create multiple objects and verified ID progression.

### How to Run
```bash
javac src/com/school/Student.java src/com/school/Course.java src/com/school/Main.java
java -cp src com.school.Main


