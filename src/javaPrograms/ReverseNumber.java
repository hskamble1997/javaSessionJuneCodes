package javaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseANumber("4321"));
		
	}

	
	public static int reverseANumber(int n) {
		
		int result =0;
		while(n>0) {
			result =result*10 + n%10;
			n=n/10;
		}
		return result;
		
	}
	
	public static int reverseANumber(String n) {
		
		int num= Integer.parseInt(n);
		int result =0;
		while(num>0) {
			result =result*10 + num%10;
			num=num/10;
		}
		return result;
		
	}
	
	

}
