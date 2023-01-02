package javaPrograms;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,2,1,9,5,6,7,8,11};
		System.out.println("Before sorting"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sorting"+Arrays.toString(arr));
		approach1(arr, 8);
		
		
	}

	public static void approach1(int arr[],int searchKey) {
		
		int l = 0;
		int h = arr.length-1;
		boolean flag =false;
		
		

		while(l<=h){
			
			int mid = (l+h)/2;
			
			if(arr[mid]==searchKey) {
				System.out.println("Element Found "+mid);
				flag = true;
				break;
			}
			
			if(searchKey < arr[mid]) {
				h=mid-1;
				
			}
			
			if(searchKey > arr[mid]) {
				l=mid+1;
			}
			
			
		}
		
		if(!flag) {
			System.out.println("Element not found");
		}
		
	}
	
}
