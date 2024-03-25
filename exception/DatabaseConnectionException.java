package exception;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.JobList;

@SuppressWarnings("serial")
public class DatabaseConnectionException extends Exception { 
	private static final String  = null;

	public DatabaseConnectionException(String message) { super(message); }

	private int CompanyID;
	
	public List<JobList> getJobList() { 
		List<JobList> jobList = new ArrayList<>();
		Connection conn = null; 
		Statement stmt = null; 
		ResultSet rs = null; 
		try { 
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CC","Kavin2830", "KavinyaaK*28"); 
			String sql = "SELECT * FROM job_listings"; 
			 stmt = conn.createStatement(); 
			  rs = stmt.executeQuery(sql); 
			   while (rs.next()) { 
				    int JobId = rs.getInt("job_id"); 
				    String JobTitle = rs.getString("job_title"); 
                     JobList JobList = new JobList( JobId, CompanyID, JobTitle ); 
                     JobList.add(JobList); }}
		catch (SQLException e) { 
			throw new DatabaseConnectionException("Error connecting to the database: " + e.getMessage()); } 
		finally { 
			    try { if (rs != null) { rs.close(); }
			       if (stmt != null) { stmt.close(); }
			       if (conn != null) { conn.close(); }}  
			    catch (SQLException e) { e.printStackTrace(); }  
		return jobList;
			   }
	}
}
