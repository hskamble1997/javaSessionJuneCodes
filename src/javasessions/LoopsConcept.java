package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		
		//printing 1 to 10 using while loop
		
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
			
		}
		System.out.println("-------");
		
		//0 to 10 : 0 2 4 6...10--even numbers
		
		int e=0;
		while(e<=10) {
			System.out.println(e);
			e=e+2;
		}
		System.out.println("-------");
		
		//1 3 5 7..-->Odd
		
		int g=1;
		while(g<=10) {
			System.out.println(g);
			g=g+2;
			
		}
		System.out.println("-------");
		
		while(true) {
			System.out.println("...Welcome to Taj Hotel...");
			break;
		}
		System.out.println("-------");
		
		//print 1 to 100 and print hello if number is multiple of 5
		int k=1;
		while(k<=100) {
			System.out.println(k);
			if(k%5==0) {
				System.out.println("Hiiii");
			}
			
			if(k == 50) {
				System.out.println("Half century");
			}
			
			if(k==100) {
				System.out.println("Century");
			}
			k++;
		}
		System.out.println("---------");
		
		//2.for loop
		//1 to 10
		for(int t=1;t<=10;t++) {
			System.out.println(t);
			if(t==5) {
				break;
			}		
			
		}
		System.out.println("------");
		
		for(;;) {
			System.out.println("bye");
			break;
		}
		System.out.println("------");
		
		for(byte b=1; b<=10;b++) {
			System.out.println(b);
		}
		System.out.println("------");
		
		for(double d=1.0;d<10.0;d++) {
			System.out.println(d);
		}
		System.out.println("------");
		
		for(char c='a';c<='z';c++) {
			System.out.println(c+" : "+(int)c);
		}
		
		int p=1;
		
		do {
			
			System.out.println(p);
			p++;
		} while (p<=10);
		
		System.out.println("-----------");
		
		int count = 10;
		while(count>0) {
			System.out.println(count);
			count--;
		}
		
		System.out.println("-----------");
		
		int rowCount = 10;
		do {
			System.out.println(rowCount--);
		} while (rowCount>0);
		
		
		
		
		
		
		
	}

}
