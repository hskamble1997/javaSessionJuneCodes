package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println(a+b);
		
		String x ="Hello";
		String y ="World";
		
		double d1= 12.33;
		double d2= 12.44;
		
		char c1='a';
		char c2='b';
		
		System.out.println(x+y);
		System.out.println(a+x);
		System.out.println(x+a);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
		
		System.out.println("hello world harshal");
		System.out.println("the value of a "+ a);
		System.out.println("the value of b "+ b);
		System.out.println("the sum is "+ (a+b));
		
		System.out.println(a+b+x+y+a+b);
		System.out.println(a+b+x+y+(a+b));
		
		System.out.println(x+y+d1+d2);
		System.out.println(x+c1);
		System.out.println(x+y+(c1+c2));

	}

}
