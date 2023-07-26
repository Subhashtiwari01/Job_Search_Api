package com.Project.JobSearch.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Job {
    @Id
    private Long id;

    private String title;
    private String description;
    private String location;

    @Min(value = 20000)
    private Double salary;

    private String companyEmail;

    private String companyName;

    private Type jobType;


}
