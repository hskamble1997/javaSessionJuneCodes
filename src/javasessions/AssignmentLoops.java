package javasessions;

public class AssignmentLoops {

	public static void main(String[] args) {
		
		int cnt = 1;
		
		while(cnt<=5) {
			System.out.println("I am Batman");
			cnt++;
		}
		
		System.out.println("---------------------------");
		
		int count=1;
		
		while(count<10) {
			System.out.println("I am Batman "+count);
			count++;
		}
		
		System.out.println("---------------------------");
		
		int i = 10;
		
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("---------------------------");
		
		for(int r=10;r>=1;r--) {
			System.out.println(r);
			
		}
		
		System.out.println("---------------------------");
		
		int j=10;
		
		do {
			System.out.println(j);
			j--;
		}while(j>=1);

		
		System.out.println("---------------------------");
		
		int k=1;
		
		while(k<=10) {
			System.out.println("Hello World");
			k++;
		}
		
		System.out.println("---------------------------");
		
		int z=1;
		while(z<=10) {
			System.out.println(z);
			z++;
		}
		
		System.out.println("---------------------------");
		
		for(int a=1; a<=100; a++) {
			if(a%2 == 0) {
				System.out.println(a+" : "+ "Even");
			}else {
				System.out.println(a+" : "+ "odd");
			}
			
		}
		
		System.out.println("---------------------------");
		
		int score=0;
		
		for(int r=0;r<=100;r++) {
			if(score == 0) {
				System.out.println("Zero - duck");
			}
			
			if(score == 25) {
				System.out.println("good job");
			}
			
			if(score == 50) {
				System.out.println("good job - half century");
			}
			
			if(score == 100) {
				System.out.println("good job - century");
			}
			
			score++;			
		}
		System.out.println("---------------------------");
		
		int score1 = 0;
		
		while (score1<=100) {
			
			switch (score1) {
			case 0:
				System.out.println("Zero - duck");
				break;

			case 25:	
				System.out.println("good job");
				break;
				
			case 50:
				System.out.println("good job - half century");
				break;
				
			case 100:
				System.out.println("good job - century");
				break;
			
			
			}
			score1++;
		}
		System.out.println("---------------------------");
		
		
		int num=1;
		for(int t=1; t<=10;t++) {
			System.out.println(t);
			if(t%7==0) {
				System.out.println("bye, see you tomorrow");
				break;
			}
		}
		System.out.println("---------------------------");
		
		double d=1.0;
		while(d<=10.0) {
			System.out.println(d);
			d++;
		}
		System.out.println("---------------------------");
		
		for(char ch = 'a';ch<='z';ch++) {
			System.out.println(ch+" : "+(int)ch);
		}
		System.out.println("---------------------------");
		
		for(char ch = 'A';ch<='Z';ch++) {
			System.out.println(ch+" : "+(int)ch);
		}
		System.out.println("---------------------------");
		
		for(char ch = '0';ch<='9';ch++) {
			System.out.println(ch+" : "+(int)ch);
		}
		System.out.println("---------------------------");
		
		/*infinite loop
		int rr= 1;
		while(rr<=1) {
			System.out.println("HI java");
		}
		*/
		int numsArray[] = {1000,30,200,10,209};
		int largest = 0;
		for(int h =0 ;h<numsArray.length;h++) {
			if(numsArray[h]>numsArray[largest]){
				largest =h;
				
			}
		}
		System.out.println(numsArray[largest]);
		
		
	}

}
