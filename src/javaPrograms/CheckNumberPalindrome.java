package javaPrograms;

public class CheckNumberPalindrome {

	public static void main(String[] args) {
		int n = 1234;
		approach3(n);

	}
	
	public static void approach1(int n) {
		int org_num = n;
		int rev = 0;
		
		while(n!=0) {
			rev = rev*10+n%10;
			n/=10;
		}
		
		if(org_num == rev) {
			System.out.println(org_num+" is a palindrome");
		}else {
			System.out.println(org_num+" is not a palindrome");
		}
	}
	
	public static void approach2(int n) {
		StringBuffer sb = new StringBuffer(String.valueOf(n));
		int rev = Integer.parseInt(sb.reverse().toString());
		
		if(n == rev) {
			System.out.println(n+"is a palindrome");
		}else {
			System.out.println(n+"is not a palindrome");
		}
	}
	
	public static void approach3(int n) {
		StringBuilder sb = new StringBuilder();
		sb.append(n);
		sb = sb.reverse();
		
		if(Integer.parseInt(sb.toString()) == n) {
			System.out.println(sb+ "is a palindrome");
		}else {
			System.out.println(sb+" is not a plaindrome");
		}
	}

}
