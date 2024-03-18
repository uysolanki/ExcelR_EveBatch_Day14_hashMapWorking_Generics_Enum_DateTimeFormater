package day13.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeDemo {

	public static void main(String[] args) throws Exception{
////		LocalDate myObj = LocalDate.now(); 
////		System.out.println(myObj); 
//		
////		LocalTime myObj = LocalTime.now();
////		System.out.println(myObj);
//
//		LocalDateTime myObj = LocalDateTime.now();
//		System.out.println(myObj);
//		
//		//DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//		String formatedDate=myObj.format(myFormatObj);
//		System.out.println(formatedDate);
		
//	    Date date = new Date();  
//	    System.out.println("Before Format " +date);
//	    SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");  
//	    String strDate= formatter.format(date);  
//	    System.out.println("After Format  " +strDate);  
		
				
		String todaysDate="Mon Mar 18 19:49:04 IST 2024";
		System.out.println("String Format " + todaysDate);
		SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy"); 
		//DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        Date date = (Date) formatter.parse(todaysDate);
		System.out.println("Date Format " + date);

	}

}
