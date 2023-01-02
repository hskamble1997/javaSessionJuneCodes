package javaPrograms;

import java.util.Arrays;

public class CheckArrayEquals {

	public static void main(String[] args) {
		
		int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,3,4,5};
		
		test2(a1,a2);

	}
	
	public static void test1(int a1[], int a2[]) {
		boolean status = Arrays.equals(a1, a2);
		
		if(status) {
			System.out.println("Both the arrays are equal");
		}else {
			System.out.println("Both the arrays are not equal");
		}
	}

	public static void test2(int a1[], int a2[]) {
		boolean status = true;
		
		if(a1.length == a2.length) {
			for(int i=0; i<a1.length;i++) {
				if(a1[i]!=a2[i]) {
					status = false;
					break;
				}
			}
		}else {
			status = false;
		}
		
		if(status) {
			System.out.println("Both the arrays are equal");
		}else {
			System.out.println("Both the arrays are not equal");
		}
	}
}
