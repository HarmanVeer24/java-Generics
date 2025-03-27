package com.bridgeLabz.UniversityCourse;

public class AssignmentCourse extends CourseType {
    private int totalAssignments;

    public AssignmentCourse(String courseName, String department, int totalAssignments) {
        super(courseName, department);
        this.totalAssignments = totalAssignments;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Assignment-Based Course: " + getCourseName() + " | Department: " + getDepartment() + " | Total Assignments: " + totalAssignments);
    }
}
