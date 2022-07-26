package com.system.rating.ratingApp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tenures")
public class Tenure {

    @Id
    @Column(name="tenure_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tenureId;
    @Column(name="start_date")
    private Date startDate;
    @Column(name="end_date")
    private Date endDate;

    @OneToOne(mappedBy="tenure")
    @JsonIgnore
    private Job job;

    public Tenure() {
    }

    public Tenure(int tenureId, Date startDate, Date endDate, Job job) {
        this.tenureId = tenureId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.job = job;
    }

    public int getTenureId() {
        return tenureId;
    }

    public void setTenureId(int tenureId) {
        this.tenureId = tenureId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Tenure{" +
                "tenureId=" + tenureId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
