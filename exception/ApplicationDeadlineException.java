package exception;

import entity.JobApplication;

@SuppressWarnings("serial")
public class ApplicationDeadlineException extends Exception { 
	public ApplicationDeadlineException(String message) { super(message); }
	public void submitApplication(JobApplication application) { 
		try { 
			if (( application.getSubmissionDate()).after(application.getDeadline())) { 
				throw new ApplicationDeadlineException("Application submission deadline has passed."); } 
			} catch (ApplicationDeadlineException e) { System.out.println(e.getMessage()); }
		}
	}
