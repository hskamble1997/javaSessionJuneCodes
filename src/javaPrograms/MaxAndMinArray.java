package javaPrograms;

import java.util.Arrays;

public class MaxAndMinArray {

	public static void main(String[] args) {
		int arr[] = {2,4,5,1};
		approach2(arr);
		

	}
	
	public static void approach1(int[] arr) {
		
		Arrays.sort(arr);
		
		int min = arr[0];
		int max = arr[arr.length-1];
		
		System.out.println("Min : "+min);
		System.out.println("Max : "+max);
	}
	
	public static void approach2(int[] arr) {
		
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Max : "+max);
		
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Min : "+min);
	}

}
