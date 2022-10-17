package javasessions;

public class Assignment2 {

	public static void main(String[] args) {
		//printing odd numbers using while loop
		int i=1;
		
		while(i<=10) {
			if(i%2==1) {
				System.out.println(i);
				
			}
			i++;			
		}
		System.out.println("=============");
		//print 10 to 1 using while loop
		
		int j=10;
		
		while(j>=1) {
			System.out.println(j);
			j--;
		}
		System.out.println("=============");
		
		//print 10 to 1 using for loop
		
		for(int r=10; r>=1; r--) {
			System.out.println(r);
			
		}
		System.out.println("=============");
		
		for(char h='A'; h<='Z';h++) {
			System.out.println(h+" : "+(int)h);
		}
		System.out.println("=============");
		
		for(char l='0'; l<='9';l++) {
			System.out.println(l+" : "+(int)l);
		}
		
		

	}

}
