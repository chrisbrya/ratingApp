package com.system.rating.ratingApp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPANIES")
public class Company {
    @Id
    @Column(name="company_id")
   private int companyId;
    @Column(name="company_name")
   private String companyName;

    public Company() {
    }

    public Company(int companyId, String companyName) {
        this.companyId = companyId;
        this.companyName = companyName;
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

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
