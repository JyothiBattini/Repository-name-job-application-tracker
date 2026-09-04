package com.jyothi.jobapplicationtracker.controller;

import com.jyothi.jobapplicationtracker.model.JobApplication;
import com.jyothi.jobapplicationtracker.service.JobApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/applications")
public class JobApplicationController {

    private final JobApplicationService service;

    public JobApplicationController(JobApplicationService service) {
        this.service = service;
    }

    @PostMapping
    public JobApplication createApplication(@Valid @RequestBody JobApplication application) {
        return service.saveApplication(application);
    }

    @GetMapping
    public List<JobApplication> getAllApplications() {
        return service.getAllApplications();
    }

   @GetMapping("/{id}")
public JobApplication getApplicationById(@PathVariable Long id) {
    return service.getApplicationById(id);
}

    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable Long id) {
        service.deleteApplication(id);
    }
    @PutMapping("/{id}")
public JobApplication updateApplication(
        @PathVariable Long id,
        @Valid @RequestBody JobApplication application) {

    return service.updateApplication(id, application);
}
}
