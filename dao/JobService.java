package dao;

import java.util.List;

import entity.JobList;

public interface JobService { 
	void postJob(JobList jobList); List<JobList> getJobs();
}