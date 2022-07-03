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
        return state.toString() + "was Processed";
    }

    @PostMapping("/saveJob")
    public String saveJob(@RequestBody Job job) {
        this.jobInterfaceImpl.saveJob(job);
        return job.toString() + "was Processed";
    }

    @GetMapping("/getAllTenure")
    public List<Tenure> getAllTenure() { return this.jobInterfaceImpl.getAllTenure(); }

    @GetMapping("/getAllDepartments")
    public List<Department> getAllDepartments() { return this.jobInterfaceImpl.getAllDepartments(); }

    @GetMapping("/getAllRatings")
    public List<Rating> getAllRatings() { return this.jobInterfaceImpl.getAllRatings(); }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees() { return this.jobInterfaceImpl.getAllEmployees(); }

}
