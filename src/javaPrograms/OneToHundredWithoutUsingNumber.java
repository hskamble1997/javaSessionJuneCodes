package javaPrograms;

public class OneToHundredWithoutUsingNumber {

	public static void main(String[] args) {
		
		int one = 'A'/'A';
		String hundred = "..........";
		
		for(int i=one; i<=(hundred.length() * hundred.length()); i++) {
			System.out.println(i);
		}
		
		System.out.println("Another method");
		
		for(int i=one; i<='d'; i+=one) {
			System.out.println(i);
		}

	}

}
