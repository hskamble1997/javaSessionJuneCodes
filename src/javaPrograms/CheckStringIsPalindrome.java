package javaPrograms;

public class CheckStringIsPalindrome {

	public static void main(String[] args) {
		isPalindrome("mam");

	}
	
	public static void isPalindrome(String s) {
		String org_String = s;
		String rev = "";
		
		for(int i=s.length()-1; i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		
		if(org_String.equals(rev)) {
			System.out.println(org_String+" is a palindrome");
		}else {
			System.out.println(org_String+" is not a palindrome");
		}
	}

}
