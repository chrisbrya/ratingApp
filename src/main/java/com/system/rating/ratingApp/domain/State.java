package com.system.rating.ratingApp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.ibatis.annotations.One;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="states")
public class State {

    @Id
    @Column(name="state_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // needed to add this so that spring can know to automatically increment the primary key
    private int stateId;
    @Column(name="state_name")
    private String stateName;
    @Column(name="state_initial")
    private String stateInitial;

    @OneToMany(mappedBy = "state") //mappedBy is asking which object is this mappedBy so no datatype just the name of the object
    @JsonIgnore //telling hibernate to ignore this object which stops the infinite loop that would be created
    private List<Job> jobs;


    public State() {
    }

    public State(int stateId, String stateName, String stateInitial, List<Job> jobs) {
        this.stateId = stateId;
        this.stateName = stateName;
        this.stateInitial = stateInitial;
        this.jobs = jobs;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateInitial() {
        return stateInitial;
    }

    public void setStateInitial(String stateInitial) {
        this.stateInitial = stateInitial;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJob(List<Job> jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        return "State{" +
                "stateId=" + stateId +
                ", stateName='" + stateName + '\'' +
                ", stateInitial='" + stateInitial + '\'' +
                '}';
    }
}
