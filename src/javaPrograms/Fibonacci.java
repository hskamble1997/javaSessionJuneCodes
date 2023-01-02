package javaPrograms;

public class Fibonacci {
	public static void main(String[] args) {
		printFibonacciSeries(10);
	}
	
	public static void printFibonacciSeries(int n) {
		int first = 0;
		int second = 1;
		
		for(int i=1;i<=n;i++) {
			System.out.print(first+" ");
			int third = first + second;
			first = second;
			second=third;
		}
		
	}
	
}
