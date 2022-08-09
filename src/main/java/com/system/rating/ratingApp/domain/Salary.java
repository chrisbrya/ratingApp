package com.system.rating.ratingApp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="salaries")
public class Salary {

    @Id //use for primary key
    @Column(name="salary_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salaryId;
    @Column(name="salary")
    private int salary;


    @OneToOne(mappedBy = "salary") //mappedBy is asking which object is this mappedBy so no datatype just the name of the object
    @JsonIgnore //telling hibernate to ignore this object which stops the infinite loop that would be created
    private Job job;

    public Salary() {
    }

    public Salary(int salaryId, int salary, Job job) {
        this.salaryId = salaryId;
        this.salary = salary;
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Salary(int salaryId, int salary) {
        this.salaryId = salaryId;
        this.salary = salary;
//        this.job = job;
    }

    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salaryId=" + salaryId +
                ", salary=" + salary +
//                ", job=" + job +
                '}';
    }
}
