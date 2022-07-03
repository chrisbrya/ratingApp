package com.system.rating.ratingApp.services;

import com.system.rating.ratingApp.domain.*;

import java.util.List;

public interface JobInterface {

    public List<Company> getAllCompanies();

    public List<Job> getAllJobs();

    public List<State> getAllStates();

    public void saveState(State state);

    public void saveJob(Job job);

    public List<Tenure> getAllTenure();

    public List<Department> getAllDepartments();

    public List<Rating> getAllRatings();

    public List<Employee> getAllEmployees();
}
