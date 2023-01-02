package javaPrograms;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = approach1(6455);
		System.out.println(num);
	}
	
	public static int approach1(int num) {
		
		int sum = 0;
		while(num!=0) {
			sum = sum + num%10;
			num = num/10;	
		}
		
		return sum;
		
	}

}
