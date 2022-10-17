package javasessions;

import java.util.ArrayList;

public class TestUniversity {

	public static void main(String[] args) {
		
		ArrayList<String> courses = new ArrayList<String>();
		
		courses.add("maths");
		courses.add("Java");
		
		University u1 = new University("Michigan","USA","23.02.1997",courses);
		
		System.out.println(u1.getName());
		u1.setName("Pune University");
		System.out.println(u1.getName());
		
		System.out.println(u1.getAl());
		

	}

}
