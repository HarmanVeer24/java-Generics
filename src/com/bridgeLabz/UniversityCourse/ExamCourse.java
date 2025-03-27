package com.bridgeLabz.UniversityCourse;

public class ExamCourse extends CourseType {
    private int totalMarks;

    public ExamCourse(String courseName, String department, int totalMarks) {
        super(courseName, department);
        this.totalMarks = totalMarks;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Exam-Based Course: " + getCourseName() + " | Department: " + getDepartment() + " | Total Marks: " + totalMarks);
    }
}
