package com.bridgeLabz.ResumeScanning;

import java.util.Arrays;
import java.util.List;

public class ResumeScanningMain {
    public static void main(String[] args) {
        // Creating job roles
        SoftwareEngineer se = new SoftwareEngineer();
        DataScientist ds = new DataScientist();
        ProductManager pm = new ProductManager();

        // Creating resumes
        Resume<SoftwareEngineer> resume1 = new Resume<>("John Doe", se);
        Resume<DataScientist> resume2 = new Resume<>("Alice Smith", ds);
        Resume<ProductManager> resume3 = new Resume<>("Bob Johnson", pm);

        // Displaying individual resumes
        resume1.displayResumeDetails();
        System.out.println("-----------------------------");
        resume2.displayResumeDetails();
        System.out.println("-----------------------------");
        resume3.displayResumeDetails();
        System.out.println("\n======= Resume Processing =======");

        // Processing resumes dynamically using wildcard
        List<JobRole> jobList = Arrays.asList(se, ds, pm);
        ResumeProcessor.processResumes(jobList);
    }
}
//Candidate: John Doe
//Applied for: Software Engineer
//Responsible for developing and maintaining software applications.
//-----------------------------
//Candidate: Alice Smith
//Applied for: Data Scientist
//Responsible for analyzing and interpreting complex data to support decision-making.
//-----------------------------
//Candidate: Bob Johnson
//Applied for: Product Manager
//Oversees product development and strategy.
//
//======= Resume Processing =======
//Processing resume for: Software Engineer
//Responsible for developing and maintaining software applications.
//-----------------------------
//Processing resume for: Data Scientist
//Responsible for analyzing and interpreting complex data to support decision-making.
//-----------------------------
//Processing resume for: Product Manager
//Oversees product development and strategy.
//-----------------------------