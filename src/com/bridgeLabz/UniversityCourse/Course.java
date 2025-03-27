package com.bridgeLabz.UniversityCourse;
public class Course<T extends CourseType> {
    private T courseType;
    private String instructor;

    public Course(T courseType, String instructor) {
        this.courseType = courseType;
        this.instructor = instructor;
    }

    public void displayCourseInfo() {
        courseType.displayCourseDetails();
        System.out.println("Instructor: " + instructor);
    }
}
