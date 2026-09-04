package com.jyothi.jobapplicationtracker.service;

import com.jyothi.jobapplicationtracker.model.JobApplication;
import com.jyothi.jobapplicationtracker.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.jyothi.jobapplicationtracker.exception.ResourceNotFoundException;

@Service
public class JobApplicationService {

    private final JobApplicationRepository repository;

    public JobApplicationService(JobApplicationRepository repository) {
        this.repository = repository;
    }

    public JobApplication saveApplication(JobApplication application) {
        return repository.save(application);
    }

    public List<JobApplication> getAllApplications() {
        return repository.findAll();
    }

   public JobApplication getApplicationById(Long id) {
    return repository.findById(id)
            .orElseThrow(() ->
                    new ResourceNotFoundException(
                            "Job application not found with id: " + id));
    }
       public void deleteApplication(Long id) {
    JobApplication application = getApplicationById(id);
    repository.delete(application);
}
public JobApplication updateApplication(Long id, JobApplication updatedApplication) {

    JobApplication application = getApplicationById(id);

    application.setCompanyName(updatedApplication.getCompanyName());
    application.setJobRole(updatedApplication.getJobRole());
    application.setLocation(updatedApplication.getLocation());
    application.setStatus(updatedApplication.getStatus());
    application.setAppliedDate(updatedApplication.getAppliedDate());
    application.setJobUrl(updatedApplication.getJobUrl());
    application.setNotes(updatedApplication.getNotes());

    return repository.save(application);
}
    
        }

                
