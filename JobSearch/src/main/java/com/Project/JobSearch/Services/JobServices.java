package com.Project.JobSearch.Services;

import com.Project.JobSearch.Model.Job;
import com.Project.JobSearch.Model.Type;
import com.Project.JobSearch.Repo.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class JobServices {

    @Autowired
    IJobRepo jobRepo;

    public Iterable<Job> getAllJobs() {
        return jobRepo.findAll();

    }

    public String addJobs(Job job) {
        jobRepo.save(job);
        return "InformationAdded";
    }


    public String updateJob(Long id, Job job) {
        Optional<Job>newJob=jobRepo.findById(id);
        if(job!=null){
            jobRepo.save(job);
            return "Updated";
        }
        return "Job Not Found";

    }

    public String deleteJobById(Long id) {
        jobRepo.deleteById(id);
        return "Deleted";


    }

    public boolean checkRoomExists(Long id) {
        return jobRepo.existsById(id);
    }

    public String updateRoomById(Long id, Type type) {
        Optional<Job> updateJob=jobRepo.findById(id);
        Job newjob=null;
        if(updateJob.isPresent()){
            newjob=updateJob.get();
        }
        else{
            return "Id Not Found";
        }
        newjob.setJobType(type);
        jobRepo.save(newjob);
        return "job type updated";
    }


//    public String deleteByLocation(String location) {
//        jobRepo.delete();
//    }
}

