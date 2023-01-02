package javaPrograms;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 555;
		int c = 890;
		
		approach2(a,b,c);
		
	}
	
	public static void approach1(int a, int b, int c) {
		
		if(a>b && a>c) {
			System.out.println(a);
		}else if(b>a && b>c){
			System.out.println(b);
		}else {
			System.out.println(c);
		}
		
	}
	
	public static void approach2(int a, int b, int c) {

		int largest = c>(a>b ? a : b) ? c: (a>b ? a : b);
		System.out.println(largest);
		
	}

}
