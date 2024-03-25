package entity;

import java.util.ArrayList;
import java.util.List;

public class JobList {
	private int JobID;
	private int CompanyID;
	private String JobTitle;
	private String JobDescription;
	private String JobLocation;
	private double Salary;
	private String JobType;
	private String PostedDate;
	private List<Applicant> applicantList;

	public JobList(String jobTitle2, String companyName, double salary2) {
		this.JobID = JobID;
		this.CompanyID = CompanyID;
		this.JobTitle = JobTitle;
		applicantList = new ArrayList<>();
	}

	public JobList(String jobTitle2, String jobDescription2, String jobLocation2, double salary2, String jobType2) {
	}

	public int getJobID() {
		return JobID;
	}

	public void setJobID(int JobID) {
		this.JobID = JobID;
	}

	public int getCompanyID() {
		return CompanyID;
	}

	public void setCompanyID(int CompanyID) {
		this.CompanyID = CompanyID;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String JobTitle) {
		this.JobTitle = JobTitle;
	}

	public String getJobDescription() {
		return JobDescription;
	}

	public void setJobDescription(String JobDescription) {
		this.JobDescription = JobDescription;
	}

	public String getJobLocation() {
		return JobLocation;
	}

	public void setJobLocation(String JobLocation) {
		this.JobLocation = JobLocation;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double Salary) {
		this.Salary = Salary;
	}

	public String getJobType() {
		return JobType;
	}

	public void setJobType(String JobType) {
		this.JobType = JobType;
	}

	public String getPostedDate() {
		return PostedDate;
	}

	public void setPostedDate(String PostedDate) {
		this.PostedDate = PostedDate;
	}

	public void apply(int applicantID, String coverLetter) { 
		Applicant applicant = new Applicant(applicantID, "", ""); 
		applicantList.add(applicant); 
		System.out.println("Applicant with ID " + applicantID 
				+ " has applied for the job: " + getJobTitle()); } 

	public List<Applicant> getApplicants() { 
		return applicantList; }

	@SuppressWarnings("hiding")
	public <JobList> void add(JobList jobList) {
		
	}
	}
