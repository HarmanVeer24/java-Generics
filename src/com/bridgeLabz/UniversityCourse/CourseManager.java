package com.bridgeLabz.UniversityCourse;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private List<Course<? extends CourseType>> courseList;

    public CourseManager() {
        courseList = new ArrayList<>();
    }

    public void addCourse(Course<? extends CourseType> course) {
        courseList.add(course);
    }

    public void displayAllCourses() {
        System.out.println("\n=== University Course List ===");
        for (Course<? extends CourseType> course : courseList) {
            course.displayCourseInfo();
            System.out.println("----------------");
        }
    }
}
