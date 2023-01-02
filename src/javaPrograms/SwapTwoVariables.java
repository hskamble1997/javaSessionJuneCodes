package javaPrograms;

public class SwapTwoVariables {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		//swap with 3 variables
		/*System.out.println("Before swapping : "+ a+"   "+b);
		int t = a;
		a = b;
		b = t;
		System.out.println("After swapping : "+a+"   "+b);
		*/
		
		//swap with only 2 variables don't use third var
		/*System.out.println("Before swapping : "+ a+"   "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping : "+a+"   "+b);
		*/
		
		//using * and / operator
		/*System.out.println("Before swapping : "+ a+"   "+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("Before swapping : "+ a+"   "+b);
		*/
		
		//By using single line;
		/*System.out.println("Before swapping : "+ a+"   "+b);
		b = a+b-(a=b);
		System.out.println("Before swapping : "+ a+"   "+b);
		*/
		
		//with xor ^
		System.out.println("Before swapping : "+ a+"   "+b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("After swapping : "+ a+"   "+b);
		
		
	}
}
