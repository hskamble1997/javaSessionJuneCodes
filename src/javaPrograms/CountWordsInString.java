package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountWordsInString {

	public static void main(String[] args) {
		
		String str = "I am rodger Fedrer";
		
		approach1(str);
	}
	
	public static void approach1(String str) {
		
		int count = 1;
		for(int i=0; i<str.length();i++) {
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
				count=count+1;
			}
		}
		
		System.out.println("Total number of words are : "+count);
	}

}
