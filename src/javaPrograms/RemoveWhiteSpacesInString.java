package javaPrograms;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		
		String s = "Java selenium python    automation";
		
		
		s = s.replaceAll("\\s", "");
		
		System.out.println(s);

	}

}
