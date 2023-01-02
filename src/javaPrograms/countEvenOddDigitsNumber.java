package javaPrograms;

public class countEvenOddDigitsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		approach1(342);
	}
	
	public static void approach1(int num) {
		int evenCount = 0;
		int oddCount = 0;
		int temp = 0;
		
		while(num>0) {
			temp = num%10;
			if(temp%2 == 0) {
				evenCount++;
			}else {
				oddCount++;
			}
			
			num = num/10;
			
		}
		System.out.println("Even digits are "+evenCount);
		System.out.println("Odd digits are "+oddCount);

	}

}
