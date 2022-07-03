package com.system.rating.ratingApp.domain;

import javax.persistence.*;

@Entity
@Table(name="DEPARTMENTS")
public class Department {

    @Id
    @Column(name="department_id")
    private int departmentId;

    @Column(name="department_name")
    private String departmentName;

    @OneToOne
    @JoinColumn(name="job_id")
    private Job job;

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Department() {
    }

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
