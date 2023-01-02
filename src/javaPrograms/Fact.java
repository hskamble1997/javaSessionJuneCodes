package javaPrograms;

public class Fact {

	public static void main(String[] args) {
		
		System.out.println(findFactorial(4));
		System.out.println(factorial(0));
		
	}
	
	public static int findFactorial(int n) {
		
		if(n<1) {
			return 1;
		}else {
			return n*findFactorial(n-1);
		}
	}
	
	public static int factorial(int n) {
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
	}
	
		
}
