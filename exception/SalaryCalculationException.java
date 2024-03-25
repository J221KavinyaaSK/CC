package exception;

import java.util.List;

import entity.JobList;

@SuppressWarnings("serial")
public class SalaryCalculationException extends Exception { 
	public SalaryCalculationException(String message) { super(message); }
	
	public double calculateAverageSalary(List<JobList> jobList) {
		try {
			double totalSalary = 0;
			int validJobsCount = 0;
			for (JobList job : jobList) {
				if (job.getSalary() < 0) {
					throw new SalaryCalculationException("Invalid salary value for job listing " + job.getJobTitle());
				}
				totalSalary += job.getSalary();
				validJobsCount++;
			}
			return totalSalary / validJobsCount;
		} catch (SalaryCalculationException e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
}