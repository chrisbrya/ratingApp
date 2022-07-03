package com.system.rating.ratingApp.repository;

import com.system.rating.ratingApp.domain.Tenure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenureRepository extends JpaRepository<Tenure, Integer> {  //datatype is based off of the primary key datatype
}
