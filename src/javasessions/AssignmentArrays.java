package javasessions;

import java.util.Arrays;
import java.util.List;

public class AssignmentArrays {

	public static void main(String[] args) {
		/*Question 1: Write a program to print the following pattern using for loop:


		                        00 01 02 03 04 05 06 07 08 09 
		                        10 11 12 13 14 15 16 17 18 19 
		                        20 21 22 23 24 25 26 27 28 29 
		                        30 31 32 33 34 35 36 37 38 39
		 */
		
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(i+""+j+"\t");
			}
			System.out.println();
		}
		System.out.println("============================");
		/*Question 2: Write a program to create a static Array, having following cricket data:
		                        --name, age, team name, DOB, gender, Strike Rate
		                        --Try to create multiple Object Arrays for different players 
		                        --Try to print all the values of each player on the console
		*/
		
		Object player1[] = new Object[] {"Virat",25,"RCB","23/12/2000",'M',12.33f};
		

		Object player2[] = new Object[] {"Dhawan",32,"RR","24/12/2000",'M',86.33f};
		

		Object player3[] = new Object[] {"Mitali",30,"CSK","25/12/2000",'F',98.13f};
		
		
		for(int i=0;i<player1.length;i++) {
			System.out.print(player1[i]+" ");
		}
		
		System.out.println();
		
		for(Object e : player2) {
			System.out.print(e+" ");
		}
		
		System.out.println();
		
		for(Object e : player3) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println("================");	
		
				
		/*Question 3: Try to print the following pattern on the console:
		                        n = 4
		                        n = 3
		                        n = 2
		                        n = 1
		                        n = 0*/
		
		
		int n[] = new int[5];
		n[0] = 4;
		n[1] = 3;
		n[2] = 2;
		n[3] = 1;
		n[4] = 0;
		
		
//		for(int e : n) {
//			System.out.println("n = "+e);
//		}
		for(int index = 0; index<n.length; index++) {
			System.out.println("n = "+n[index]);
		}
		
		
	}

}
