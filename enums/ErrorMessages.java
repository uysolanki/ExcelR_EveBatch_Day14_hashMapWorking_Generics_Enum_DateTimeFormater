package day13.enums;

public enum ErrorMessages {

			ERROR_1("E101", "USERNAME IS INVALID"),
			ERROR_2("E102", "PASSWORD IS INVALID"),
			ERROR_3("E103", "TEXTBOXES CANNOT BE EMPTY");
					
					
	String error_code;
	String error_message;
	
	private ErrorMessages() {} //A

	private ErrorMessages(String error_code, String error_message) //B
	{
		this.error_code = error_code;
		this.error_message = error_message;
		//System.out.println("P C called");
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public String getError_message() {
		return error_message;
	}

	public void setError_message(String error_message) {
		this.error_message = error_message;
	}
	
	
}
