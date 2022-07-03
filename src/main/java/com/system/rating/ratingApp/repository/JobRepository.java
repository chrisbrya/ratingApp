package com.system.rating.ratingApp.repository;

import com.system.rating.ratingApp.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> { //datatype is based off of the primary key datatype
}
