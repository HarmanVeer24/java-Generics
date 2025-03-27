package com.bridgeLabz.ResumeScanning;

public class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public void displayResumeDetails() {
        System.out.println("Candidate: " + candidateName);
        System.out.println("Applied for: " + jobRole.getJobTitle());
        jobRole.jobDescription();
    }
}
