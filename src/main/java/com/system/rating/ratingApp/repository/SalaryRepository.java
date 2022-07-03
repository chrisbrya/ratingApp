package com.system.rating.ratingApp.repository;

import com.system.rating.ratingApp.domain.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer> { //datatype is based off of the primary key datatype
}
