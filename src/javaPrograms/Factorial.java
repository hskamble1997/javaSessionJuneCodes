package javaPrograms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(approach3(3));
	}
	
	public static void approach1(int n) {
		int fact = 1;
		
		for(int i=1; i<=n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
	
	public static void approach2(int n) {
		int fact = 1;
		
		for(int i=n; i>=1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
	
	public static int approach3(int n) {
		
		if(n<1) {
			return 1;
		}else {
			return n * approach3(n-1);
			
		}
	}

}
