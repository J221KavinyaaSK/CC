package exception;

@SuppressWarnings("serial")
public class InvalidEmailFormatException extends Exception { 
	public InvalidEmailFormatException(String message) { super(message); }
	
	public void registerApplicant(String email) {
		try {
			if (!isValidEmail(email)) { 
				throw new InvalidEmailFormatException("Invalid email format. Please enter a valid email address."); 
				} 
			} 
		catch (InvalidEmailFormatException e) { 
			System.out.println(e.getMessage()); }
			}

	private boolean isValidEmail(String email) {
		return false;
	}

}