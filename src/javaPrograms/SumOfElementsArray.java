package javaPrograms;

import java.util.Arrays;

public class SumOfElementsArray {

	public static void main(String[] args) {
		
		int arr[] = new int[] {10,20,30,40};
		approach2(arr);
	}
	
	public static int approach1(int arr[]) {
		
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static int approach2(int arr[]) {
		int sum = 0;
		
		for(int s : arr) {
			sum = sum + s;
		}
		
		System.out.println(sum);
		return sum;
	}
}
