package entity;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("hiding")
public class Company<JobList> {
	private int CompanyID;
	private String CompanyName;
	private String Location;

	public Company(int CompanyID, String CompanyName, String Location)

	{
		this.CompanyID = CompanyID;
		this.CompanyName = CompanyName;
		this.Location = Location;
	}

	public int getCompanyID() {
		return CompanyID;
	}

	public void setCompanyID(int CompanyID) {
		this.CompanyID = CompanyID;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String CompanyName) {
		this.CompanyName = CompanyName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String Location) {
		this.Location = Location;
	}

 private List<JobList> jobList = new ArrayList<>(); 
 @SuppressWarnings({ "unchecked", "unused" })
public void PostJob(String jobTitle, String jobDescription, String jobLocation, double salary, String jobType) {  
	 entity.JobList jobList = new entity.JobList(jobTitle, jobDescription, jobLocation, salary, jobType); //
	 List<JobList> JobList = null;
	jobList.add((JobList) jobList); 
	 }

    public List<JobList> GetJobs() { List<JobList> jobList = null;
	return jobList; }

	public List<JobList> getJobList() {
		return jobList;
	}

	public void setJobList(List<JobList> jobList) {
		this.jobList = jobList;
	}
}
