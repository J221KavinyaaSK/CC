package mainmodule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Applicant;
import entity.JobList;

public class Main {
	public List<JobList> getJobListings() { List<JobList> jobListings = new ArrayList<>(); 
	try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CC","Kavin2830", "KavinyaaK*28");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Jobs")) { 
		while (rs.next()) { 
			String jobTitle = rs.getString("job_title"); 
			String companyName = rs.getString("company_name"); 
			double salary = rs.getDouble("salary"); 
			JobList jobList= new JobList(jobTitle, companyName, salary); jobList.add(jobList); } } 
	catch (SQLException e) { 
		System.err.println("Error retrieving job listings: " + e.getMessage()); } 
	return jobListings;
	
	public void createApplicantProfile(Applicant applicant) { 
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CC","Kavin2830", "KavinyaaK*28"); 
				PreparedStatement stmt = conn.prepareStatement("INSERT INTO Applicants (name, email, phone) VALUES (?, ?, ?)")) { 
			stmt.setString(1, applicant.getFirstName()); 
			stmt.setString(2, applicant.getEmail()); 
			stmt.setString(3, applicant.getPhone()); 
			stmt.executeUpdate(); } 
		catch (SQLException e) { System.err.println("Error creating applicant profile: " + e.getMessage()); }
	}
	}
	
}