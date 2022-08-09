package com.system.rating.ratingApp.services;

import com.system.rating.ratingApp.domain.*;

import java.util.List;
import java.util.Optional;

public interface JobInterface {

    public List<Company> getAllCompanies();

    public List<Job> getAllJobs();

    public List<State> getAllStates();

    public void saveState(State state);

    public void saveCompany(Company company);

    public void saveJob(Job job);

    public void saveEmployee(Employee employee);

    public void saveDepartment(Department department);

    public void saveRating(SaveRating saveRating);

    public List<Tenure> getAllTenure();

    public List<Department> getAllDepartments();

    public List<Rating> getAllRatings();

    public List<Employee> getAllEmployees();

    public List<Employee> findEmployeeByJob(Job job);

    public Optional<Job> findJobById(int jobId);

}
