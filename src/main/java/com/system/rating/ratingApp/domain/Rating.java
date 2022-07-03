package com.system.rating.ratingApp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RATINGS")
public class Rating {

    @Id
    @Column(name="rating_id")
    private int ratingId;

    @Column(name="actual_rating")
    private String actualRating;

    @Column(name="comments")
    private String comments;


    public Rating() {
    }

    public Rating(int ratingId, String actualRating, String comments) {
        this.ratingId = ratingId;
        this.actualRating = actualRating;
        this.comments = comments;
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

    @Override
    public String toString() {
        return "Rating{" +
                "ratingId=" + ratingId +
                ", actualRating='" + actualRating + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
