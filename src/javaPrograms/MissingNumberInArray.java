package javaPrograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int a1[] = {1,2,4,3,10,6,7,8,9};
		test1(a1,10);

	}
	
	public static void test1(int a1[],int range) {
		
		//sum array
		//array range sum
		//sum2-sum1
		
		int sum1 = 0;
		for(int i=0;i<a1.length;i++) {
			sum1 = sum1 + a1[i];
		}
		
		int sum2 = 0;
		for(int i = 1; i<=range;i++) {
			sum2 = sum2 + i;
		}
		
		System.out.println(sum2 - sum1);
	}

}
