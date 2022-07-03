package com.system.rating.ratingApp.repository;

import com.system.rating.ratingApp.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Integer> {
}
