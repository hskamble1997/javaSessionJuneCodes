package javaPrograms;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr = {3,4,2,1,9,5,6,7,8,11};
		
		int search_Ele = 119;
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==search_Ele) {
				System.out.println("Element found at position "+ i);
				flag = true;
				break;
			}
			
			
		}
		
		if(!flag) {
			System.out.println("Element not found");
		}

	}

}
