package javaPrograms;

public class CountSingleCharacterOccurence {

	public static void main(String[] args) {
		
		String str = "I am learning java";
		
		int count = checkCharOccureence(str, 'n');
		
		System.out.println(count);

	}
	
	public static int checkCharOccureence(String s,char ch) {
		String letter = String.valueOf(ch);
		return s.length()-s.replaceAll(letter, "").length();
	}

}
