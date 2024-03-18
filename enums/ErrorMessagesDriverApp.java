package day13.enums;

public class ErrorMessagesDriverApp {

	public static void main(String[] args) {
		String username="alice@gmail.com";
		String password="alice";
		ErrorMessages msg1=null;
		if(username.length()==0 ||password.length()==0 )
		{
			msg1=ErrorMessages.ERROR_3;
			System.out.println(msg1.getError_message());
		}
		
		if(username.length()<8)
		{
			msg1=ErrorMessages.ERROR_1;
			System.out.println(msg1.getError_message());
		}
		
		if(password.length()<8)
		{
			msg1=ErrorMessages.ERROR_2;
			System.out.println(msg1.getError_message());
		}
		

	}

}
