package javaPrograms;

import java.util.ArrayList;

public class ExtractOddEvenFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,11,20,13,30,33};
		approach2(arr);
		
	}
	
	public static void approach1(int arr[]) {
		
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				even.add(arr[i]);
			}else {
				odd.add(arr[i]);
			}
		}
		
		for(int n:even) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		
		for(int m:odd) {
			System.out.print(m+" ");
		}
	
	}

	public static void approach2(int arr[]) {
		
		System.out.println("Even numbers");
		for(int a : arr) {
			if(a%2 == 0) {
				System.out.print(a+" ");
			}
		}
		
		System.out.println();
		System.out.println("Odd numbers");
		for(int b : arr) {
			if(b%2 != 0) {
				System.out.print(b+" ");
			}
		}
	}
	
	
}
