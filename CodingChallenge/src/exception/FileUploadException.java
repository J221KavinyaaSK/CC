package exception;

import java.io.File;

@SuppressWarnings("serial")
public class FileUploadException extends Exception { 
	public FileUploadException(String message) { super(message); }
	
	public void uploadResume(File resumeFile) { 
		try { 
			int MAX_FILE_SIZE = 200;
			if (resumeFile.length() > MAX_FILE_SIZE) { 
				throw new FileUploadException("File size exceeds the maximum allowed limit."); } 
			 if (!isPdfFile(resumeFile)) { 
				 throw new FileUploadException("File format not supported. Please upload a PDF file."); } 
			  } 
		catch (FileUploadException e) { System.out.println(e.getMessage()); }
	}

	private boolean isPdfFile(File resumeFile) {
		return false;
	}
	}
