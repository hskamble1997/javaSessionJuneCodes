package javaPrograms;

public class CountCharOccurence {

	public static void main(String[] args) {
		
		String s = "I am jammer";
		
		int occurance = s.length()-s.replaceAll("I", "").length();
		System.out.println(occurance);
		

	}

}
