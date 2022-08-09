package com.system.rating.ratingApp.jobcontroller;

import com.system.rating.ratingApp.domain.*;
import com.system.rating.ratingApp.services.JobInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //makes all methods return JSON objects and when it receives data it turns it into a JSON object
@RequestMapping("/job")
public class JobController {

    @Autowired
    JobInterfaceImpl jobInterfaceImpl;

    @GetMapping("/getAllCompanies")
    public List<Company> getAllCompanies() {
        return this.jobInterfaceImpl.getAllCompanies();
    }

    @GetMapping("/getAllJobs")
    public List<Job> getAllJobs(){
        return this.jobInterfaceImpl.getAllJobs();
    }

    @GetMapping("/getAllStates")
    public List<State> getAllStates(){
        return this.jobInterfaceImpl.getAllStates();
    }

    @PostMapping("/saveState") //for retrieving info from user
    public String saveState(@RequestBody State state){ //@RequestBody lets spring know that this is coming in through the body @Param is through URL
        this.jobInterfaceImpl.saveState(state);
        return state.toString() + " was Processed";
    }

    @PostMapping("/saveJob")
    public String saveJob(@RequestBody Job job) {
        this.jobInterfaceImpl.saveJob(job);
        return job.toString() + " was Processed";
    }

    @PostMapping("/saveDepartments")
    public String saveDepartment(@RequestBody Department department) {
        this.jobInterfaceImpl.saveDepartment(department);
        return department.toString() + " was Processed";
    }

    @PostMapping("/saveCompanies")
    public String saveCompany(@RequestBody Company company) {
        this.jobInterfaceImpl.saveCompany(company);
        return company.toString() + " was Processed";
    }

    @PostMapping("/saveRatings")
    public String saveRating(@RequestBody SaveRating saveRating) {
        this.jobInterfaceImpl.saveRating(saveRating);
        return saveRating.toString() + " was Processed";
    }

    @PostMapping("/saveEmployees")
    public String saveEmployee(@RequestBody Employee employee) {
        this.jobInterfaceImpl.saveEmployee(employee);
        return employee.toString() + " was Processed";
    }

    @GetMapping("/getAllTenure")
    public List<Tenure> getAllTenure() { return this.jobInterfaceImpl.getAllTenure(); }

    @GetMapping("/getAllDepartments")
    public List<Department> getAllDepartments() { return this.jobInterfaceImpl.getAllDepartments(); }

    @GetMapping("/getAllRatings")
    public List<Rating> getAllRatings() { return this.jobInterfaceImpl.getAllRatings(); }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees() { return this.jobInterfaceImpl.getAllEmployees(); }

    @GetMapping("/getAllEmployeesByJob")
    public List<Employee> getEmployeeByJob(@RequestParam(name = "jobId") int jobId) {
            Job job = new Job();
        return null;
    }

}
