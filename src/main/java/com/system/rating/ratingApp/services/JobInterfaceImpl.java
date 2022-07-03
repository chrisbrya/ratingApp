package com.system.rating.ratingApp.services;

import com.system.rating.ratingApp.domain.*;
import com.system.rating.ratingApp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobInterfaceImpl implements JobInterface{

    @Autowired //use a bean inside of another bean
    private CompanyRepository companyRepository;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private TenureRepository tenureRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private EmployeeRespository employeeRespository;


    @Override
    public List<Company> getAllCompanies() {
        return this.companyRepository.findAll();


    }

    @Override
    public List<Job> getAllJobs() {
        return this.jobRepository.findAll();
    }

    @Override
    public List<State> getAllStates() {
        return this.stateRepository.findAll();
    }

    @Override
    public void saveState(State state) {
        this.stateRepository.save(state);
    }

    @Override
    public void saveJob(Job job) {
        this.jobRepository.save(job);
    }

    @Override
    public List<Tenure> getAllTenure() {
        return this.tenureRepository.findAll();
    }

    @Override
    public List<Department> getAllDepartments() {
        return this.departmentRepository.findAll();
    }

    @Override
    public List<Rating> getAllRatings() {
        return this.ratingRepository.findAll();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeRespository.findAll();
    }


}
