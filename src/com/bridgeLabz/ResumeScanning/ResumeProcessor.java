package com.bridgeLabz.ResumeScanning;

import java.util.List;

public class ResumeProcessor {
    public static void processResumes(List<? extends JobRole> jobRoles) {
        for (JobRole role : jobRoles) {
            System.out.println("Processing resume for: " + role.getJobTitle());
            role.jobDescription();
            System.out.println("-----------------------------");
        }
    }
}