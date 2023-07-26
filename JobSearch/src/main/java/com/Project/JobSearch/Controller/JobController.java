package com.Project.JobSearch.Controller;

import com.Project.JobSearch.Model.Job;
import com.Project.JobSearch.Model.Type;
import com.Project.JobSearch.Services.JobServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JobController {

    @Autowired
    JobServices jobServices;

    @GetMapping("job")

    public Iterable<Job> getAllJobs(){
        return jobServices.getAllJobs();
    }
    @PostMapping("addjob")
    public String addJobs(@RequestBody Job job){
        return jobServices.addJobs(job);
    }
    @PutMapping("job/{id}")

    public String updateJob (@PathVariable Long id,@RequestBody Job job ){
        return jobServices.updateJob(id,job);
    }
    @DeleteMapping("job/{id}")
    public String deleteJobById(@PathVariable Long id){
        return jobServices.deleteJobById(id);
    }
    @GetMapping("job/{id}/ ")

    public boolean checkRoomExists(@PathVariable Long id){
        return jobServices.checkRoomExists(id);
    }
    @PutMapping("job/{id}/{type}")
    public String updateRoomById(@PathVariable Long id, @PathVariable Type type){
        return jobServices.updateRoomById(id,type);
    }
//
//    @DeleteMapping("job/{id}/location")
//    public String deleteByLocation(@PathVariable String location){
//        return jobServices.deleteByLocation(location);
//
//    }



}
