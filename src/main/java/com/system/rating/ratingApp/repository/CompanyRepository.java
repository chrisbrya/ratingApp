package com.system.rating.ratingApp.repository;

import com.system.rating.ratingApp.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> { //datatype is based off of the primary key datatype
}
