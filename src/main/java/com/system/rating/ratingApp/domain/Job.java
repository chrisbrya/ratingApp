package com.system.rating.ratingApp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.util.List;

@Entity //this goes to the database or links to the database
@Table(name="jobs")
public class Job {
    @Id
    @Column(name="job_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobId;
    @Column(name="job_description")
    private String jobDescription;
    @Column(name="job_title")
    private String jobTitle;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToOne
    @JoinColumn(name = "salary_id")
    private Salary salary;

    @OneToOne
    @JoinColumn(name = "tenure_id")
    private Tenure tenure;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToMany
    @JsonIgnore
    private List<Employee> employees;

    @ManyToMany
    @JoinTable(
            name = "job_ratings",
            joinColumns = @JoinColumn(name = "job_id"),
            inverseJoinColumns = @JoinColumn(name = "rating_id")
    )
    private List<Rating> ratings;


//    @Column(name = "employee_id")
//    private int employeeId;



    public Job() {
    }

    public Job(int jobId, String jobDescription, String jobTitle, State state, Company company, Salary salary, Tenure tenure, Department department
            , List<Rating>ratings, List<Employee> employees) {
        this.jobId = jobId;
        this.jobDescription = jobDescription;
        this.jobTitle = jobTitle;
        this.state = state;
        this.company = company;
        this.salary = salary;
        this.tenure = tenure;
        this.department = department;
        this.ratings = ratings;
        this.employees = employees;
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

    public State getState() {
        return state;
    }

    public void setStates(State state) {
        this.state = state;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Tenure getTenure() {
        return tenure;
    }

    public void setTenure(Tenure tenure) {
        this.tenure = tenure;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
    //    SALARY_ID                NUMBER
//    STATE_ID                 NUMBER
//    COMPANY_ID               NUMBER
//    EMPLOYEE_ID              NUMBER
//    TENURE_ID                NUMBER

