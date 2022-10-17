package javasessions;

public class TypeCasting {

	public static void main(String[] args) {
		byte b=2;
		short s=b;
		int i=b;
		long l=b;
		
		System.out.println(b);
		System.out.println(s);
		
		
		int p=100;
		
		short s1 = (short)p;
		byte b1= (byte)s1;
		
		System.out.println(s1);
		System.out.println(b1);
		
		byte m=100;
		byte n=114;
		int t1= m+n;
		byte t = (byte)(m+n);
		System.out.println(t1);
		System.out.println(t);
		
		
		char c=97;
		System.out.println(c+'b');
		
		
		
		

	}

}
