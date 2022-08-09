package com.system.rating.ratingApp.repository;

import com.system.rating.ratingApp.domain.SaveRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveRatingRepository extends JpaRepository<SaveRating, Integer> {
}
