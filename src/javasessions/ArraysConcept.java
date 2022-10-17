package javasessions;

public class ArraysConcept {

	public static void main(String[] args) {
		//arrays:
		// limitations of array:
		//1. similar type of data only: to overcome this issue we have to use dynamic array or object array
		//2. size is fixed : static array to overcome this issue: we have to use ArrayList
		
		//int array
		
		//a. using keyword
		int i[] = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
		System.out.println(i.length);
		int len = i.length;
		int li = 0;
		int hi = len-1;
		System.out.println("li = "+li);
		System.out.println("hi = "+hi);
		System.out.println("lngth = "+len);
		
		System.out.println("--------------");
		//to print all the values from array : Iterate this array using for loop
		for(int k=0;k<i.length;k++) {
			System.out.println(i[k]);
		}
		System.out.println("--reverse order--");
		
		//to print the reverse order:
		for(int p=i.length-1;p>=0;p--) {
			System.out.println(i[p]);
		}
		
		System.out.println("--------------");
		
		System.out.println(i[0]+i[1]);
		
		System.out.println("--------------");
		
		//2.double
		double d[]=new double[2];//0-1
		d[0]=12.33;
		d[1]=23.44;
		System.out.println(d[0]);
		System.out.println("--------------");
		
		//3.char
		
		char c[] = new char[3];//0-2
		c[0]='a';
		c[1]='b';
		c[2]='$';
		System.out.println(c[0]+c[1]);
		System.out.println("--------------");
		
		for(int g=0;g<c.length;g++) {
			System.out.println(c[g]);
		}
		
		System.out.println("--------------");
		
		byte b1=065;//Octal number->number staring with zero and every digit within range 0-7 and having base as 8
		System.out.println(b1);
		//065 = (0*8^2) + (6*8^1) + (5*8^0)=53
		System.out.println("--------------");
		
		String h = "hello selenium";
		char test = 't';
		System.out.println(h+test);
		
		byte n = 10;
		byte m = 11;
		int t1 = n+m;//21
		System.out.println(t1);
		
		
		
		
		
		

	}

}
