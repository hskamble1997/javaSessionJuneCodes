package javaPrograms;

import java.util.Arrays;

public class AnagramTest {

	public static void main(String[] args) {
		String s1 = "mary";
		String s2 = "army";
		
		char[] arr1 = s1.toLowerCase().toCharArray();
		char[] arr2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Given strings are anagram");
		}else {
			System.out.println("Given strings are not anagram");
		}

		
		
		
	}
	
	
}
