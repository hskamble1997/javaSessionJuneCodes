package javaPrograms;

public class RemovalOfSpecialCharsInString {

	public static void main(String[] args) {
		
		String s = "Java&#@*HARSHAL123";
		
		s = s.replaceAll("[^A-Za-z]", "");
		System.out.println(s);
		

	}

}
