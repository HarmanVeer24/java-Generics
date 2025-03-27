package com.bridgeLabz.UniversityCourse;

public class UniversityCourse {
    public static void main(String[] args) {
        // Creating Different Course Types
        ExamCourse javaExam = new ExamCourse("Java Programming", "Computer Science", 100);
        AssignmentCourse dbmsAssignment = new AssignmentCourse("Database Systems", "Information Technology", 5);
        ResearchCourse aiResearch = new ResearchCourse("Artificial Intelligence", "Computer Science", "Deep Learning");

        // Creating Generic Course Instances
        Course<ExamCourse> course1 = new Course<>(javaExam, "Dr. Smith");
        Course<AssignmentCourse> course2 = new Course<>(dbmsAssignment, "Prof. Brown");
        Course<ResearchCourse> course3 = new Course<>(aiResearch, "Dr. Patel");

        // Managing Courses
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        courseManager.addCourse(course3);

        // Display All Courses
        courseManager.displayAllCourses();
    }
}
//=== University Course List ===
//Exam-Based Course: Java Programming | Department: Computer Science | Total Marks: 100
//Instructor: Dr. Smith
//----------------
//Assignment-Based Course: Database Systems | Department: Information Technology | Total Assignments: 5
//Instructor: Prof. Brown
//----------------
//Research-Based Course: Artificial Intelligence | Department: Computer Science | Research Topic: Deep Learning
//Instructor: Dr. Patel
//----------------