package javaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//checkPrime(7);
		approach2(100);
	}
	
	public static void checkPrime(int num) {
		
		int count = 0;
		
		if(num > 1) {
			for(int i=1; i<=num; i++) {
				if(num%i == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println("Is prime number");
			}else {
				System.out.println("Is not prime number");
			}
			
		}else {
			System.out.println("Is not prime number");
		}
		
	}
	
	public static void approach2(int n) {
		int count = 0;
		for(int i=1; i <= n; i++) {
			for(int j = 1 ; j<=n; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.print(i+" ");
			}
			count = 0;
		}
		
	}

}
