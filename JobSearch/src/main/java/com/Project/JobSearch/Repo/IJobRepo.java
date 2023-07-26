package com.Project.JobSearch.Repo;

import com.Project.JobSearch.Model.Job;
import org.springframework.data.repository.CrudRepository;

public interface IJobRepo extends CrudRepository<Job,Long> {
}
