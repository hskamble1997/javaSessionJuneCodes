package javaPrograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FutureDate {

	public static void main(String[] args) {
		/*
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Using today's date
		c.add(Calendar.DATE, 45); // Adding 5 days
		String output = sdf.format(c.getTime());
		System.out.println(output);
		*/
		approachFutureDate(45);
	}
	
	public static void approachFutureDate(int futureDays) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());//Using today's date
		c.add(Calendar.DATE, futureDays); // Adding 5 days
		String output = sdf.format(c.getTime());
		System.out.println(output);
	
	
	}

}
