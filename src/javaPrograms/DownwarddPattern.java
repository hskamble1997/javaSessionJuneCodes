package javaPrograms;

public class DownwarddPattern {

	public static void main(String[] args) {
		
		int count =1;
		for(int i=5; i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
		
	}		
}
	
