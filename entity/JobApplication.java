package entity;

import java.time.LocalDateTime;

public class JobApplication {
	private int ApplicationID;
	private int JobID;
	private int ApplicantID;
	private LocalDateTime ApplicationDate;
	private String CoverLetter;

	public JobApplication(int ApplicationID, int JobID, int ApplicantID, LocalDateTime ApplicationDate,
			String CoverLetter) {
		this.ApplicationID = ApplicationID;
		this.JobID = JobID;
		this.ApplicantID = ApplicantID;
		this.ApplicationDate = ApplicationDate;
		this.CoverLetter = CoverLetter;
	}

	public int getApplicationID() {
		return ApplicationID;
	}

	public void setApplicationID(int ApplicationID) {
		this.ApplicationID = ApplicationID;
	}

	public int getJobID() {
		return JobID;
	}

	public void setJobID(int JobID) {
		this.JobID = JobID;
	}

	public int getApplicantID() {
		return ApplicantID;
	}

	public void setApplicantID(int ApplicantID) {
		this.ApplicantID = ApplicantID;
	}

	public LocalDateTime getApplicationDate() {
		return ApplicationDate;
	}

	public void setApplicationDate(LocalDateTime ApplicationDate) {
		this.ApplicationDate = ApplicationDate;
	}

	public String getCoverLetter() {
		return CoverLetter;
	}

	public void setCoverLetter(String CoverLetter) {
		this.CoverLetter = CoverLetter;
	}

	public Object getSubmissionDate() {
		return null;
	}

	public Object getDeadline() {
		return null;
	}
}
