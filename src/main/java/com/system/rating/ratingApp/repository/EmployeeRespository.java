package com.system.rating.ratingApp.repository;

import com.system.rating.ratingApp.domain.Employee;
import com.system.rating.ratingApp.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Integer> {
    public List<Employee> findByJob(Job job);
}
