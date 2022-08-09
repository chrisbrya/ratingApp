package com.system.rating.ratingApp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="RATINGS")
public class Rating {

    @Id
    @Column(name="rating_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ratingId;

    @Column(name="actual_rating")
    private String actualRating;

    @Column(name="comments")
    private String comments;

    @ManyToMany(mappedBy = "ratings")
    @JsonIgnore
    private List<Job> jobs;


    public Rating() {
    }

    public Rating(int ratingId, String actualRating, String comments, List<Job> jobs) {
        this.ratingId = ratingId;
        this.actualRating = actualRating;
        this.comments = comments;
        this.jobs = jobs;
    }

    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    public String getActualRating() {
        return actualRating;
    }

    public void setActualRating(String actualRating) {
        this.actualRating = actualRating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingId=" + ratingId +
                ", actualRating='" + actualRating + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
