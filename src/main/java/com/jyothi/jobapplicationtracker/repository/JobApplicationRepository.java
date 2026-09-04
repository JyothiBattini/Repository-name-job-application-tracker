package com.jyothi.jobapplicationtracker.repository;

import com.jyothi.jobapplicationtracker.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
}
