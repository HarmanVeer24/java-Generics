package com.bridgeLabz.ResumeScanning;

public abstract class JobRole {
    private String jobTitle;

    public JobRole(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public abstract void jobDescription();
}
