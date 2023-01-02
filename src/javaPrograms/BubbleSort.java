package javaPrograms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,2,1,9,5,6,7,8,11};
		approach1(arr);
		
	}
	
	public static void approach1(int arr[]) {
		
		System.out.println("Before sorting : "+Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("After sorting : "+Arrays .toString(arr));
	}

}
