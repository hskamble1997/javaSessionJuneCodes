package javaPrograms;

public class RevereseNumberApproach {

	public static void main(String[] args) {
		System.out.println(approach3(654321));
	}
	
	public static int approach1(int n) {
		int rev = 0;
		while(n!=0) {
			rev =rev*10 + n%10;
			n=n/10;
		}
		return rev;
	}
	
	public static StringBuffer approach2(int n) {
		StringBuffer sb = new StringBuffer(String.valueOf(n));
		StringBuffer rev = sb.reverse();
		
		return rev;
	}
	
	public static StringBuilder approach3(int n) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append(n);
		sb1.reverse();
		return sb1;
	}

}
