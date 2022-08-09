package com.system.rating.ratingApp.domain;

import javax.persistence.*;

@Entity
@Table(name="RATINGS")
public class SaveRating {

        @Id
        @Column(name="rating_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int ratingId;

        @Column(name="actual_rating")
        private String actualRating;

        @Column(name="comments")
        private String comments;

//        @Column(name = "job_id")
//        private int jobId;

        public SaveRating() {
        }

        public SaveRating(int ratingId, String actualRating, String comments) {
                this.ratingId = ratingId;
                this.actualRating = actualRating;
                this.comments = comments;
//                this.jobId = jobId;
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

//        public int getJobId() {
//                return jobId;
//        }
//
//        public void setJobId(int jobId) {
//                this.jobId = jobId;
//        }

        @Override
        public String toString() {
                return "SaveRating{" +
                        "ratingId=" + ratingId +
                        ", actualRating='" + actualRating + '\'' +
                        ", comments='" + comments + '\'' +
//                        ", jobId=" + jobId +
                        '}';
        }
}
