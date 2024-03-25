package entity;

public class Applicant {
	private int ApplicantID;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Phone;
	private String Resume;

	public Applicant(int ApplicantID, String FirstName, String LastName) {
		this.ApplicantID = ApplicantID;
		this.FirstName = FirstName;
		this.LastName = LastName;
	}

	public int getApplicantID() {
		return ApplicantID;
	}

	public void setApplicantID(int ApplicantID) {
		this.ApplicantID = ApplicantID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String Phone) {
		this.Phone = Phone;
	}

	public String getResume() {
		return Resume;
	}

	public void setResume(String Resume) {
		this.Resume = Resume;
	}

	public void createProfile(String email, String firstName, String lastName, String phone) {
		setEmail(email);
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
	}
	public void applyForJob(int jobID, String coverLetter) { 
		System.out.println("Applicant with ID " + getApplicantID() 
		+ " has applied for Job ID " + jobID
	    + "."); }
	}
