package com.system.rating.ratingApp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity //this goes to the database or links to the database
@Table(name="jobs")
public class Job {
    @Id
    @Column(name="job_id")
    private int jobId;
    @Column(name="job_description")
    private String jobDescription;
    @Column(name="job_title")
    private String jobTitle;


    @OneToOne //relationship to this class to the job table
    @JoinColumn(name = "salary_id") //Goes into the table or object that has the foreign key
    private Salary salary;

    @OneToOne
    @JoinColumn(name="tenure_id")
    private Tenure tenure;

    @OneToOne(mappedBy = "job")
    @JsonIgnore
    private Department department;


    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Job() {
    }

    public Job(int jobId, String jobDescription, String jobTitle, Salary salary) {
        this.jobId = jobId;
        this.jobDescription = jobDescription;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", jobDescription='" + jobDescription + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    //    SALARY_ID                NUMBER
//    STATE_ID                 NUMBER
//    COMPANY_ID               NUMBER
//    EMPLOYEE_ID              NUMBER
//    TENURE_ID                NUMBER

}
