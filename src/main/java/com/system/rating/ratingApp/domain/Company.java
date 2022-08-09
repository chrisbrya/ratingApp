package com.system.rating.ratingApp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="COMPANIES")
public class Company {
    @Id
    @Column(name="company_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //this tells Spring to auto increment the primary key
   private int companyId;
    @Column(name="company_name")
   private String companyName;

    @OneToMany(mappedBy = "company") //mappedBy is asking which object is this mappedBy so no datatype just the name of the object
    @JsonIgnore //telling hibernate to ignore this object which stops the infinite loop that would be created
    private List<Job> jobs;

    public Company() {
    }

    public Company(int companyId, String companyName, List<Job> jobs) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.jobs = jobs;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
