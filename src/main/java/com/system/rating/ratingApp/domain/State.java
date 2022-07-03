package com.system.rating.ratingApp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="states")
public class State {

    @Id
    @Column(name="state_id")
    private int stateId;
    @Column(name="state_name")
    private String stateName;
    @Column(name="state_initial")
    private String stateInitial;

    public State() {
    }

    public State(int stateId, String stateName, String stateInitial) {
        this.stateId = stateId;
        this.stateName = stateName;
        this.stateInitial = stateInitial;
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

    @Override
    public String toString() {
        return "State{" +
                "stateId=" + stateId +
                ", stateName='" + stateName + '\'' +
                ", stateInitial='" + stateInitial + '\'' +
                '}';
    }
}
