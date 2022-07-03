package com.system.rating.ratingApp.repository;

import com.system.rating.ratingApp.domain.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {
}
