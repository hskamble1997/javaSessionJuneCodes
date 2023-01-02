package javaPrograms;

public class CountNumberDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		approach1(732847);
	}
	
	public static void approach1(int num) {
		
		int count = 0;
		
		while(num!=0) {
			num=num/10;
			count++;
			
		}
		
		System.out.println(count);
	}

}
