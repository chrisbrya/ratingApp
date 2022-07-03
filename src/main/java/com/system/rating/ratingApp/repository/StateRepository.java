package com.system.rating.ratingApp.repository;

import com.system.rating.ratingApp.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {  //datatype is based off of the primary key datatype
}
