package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "jammerr";
		approach1(str);
	}
	
	public static void approach1(String str) {
		
		char[] ch = str.toCharArray();
		
		Map<Character, Integer> hmap = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			if(!hmap.containsKey(ch[i])) {
				hmap.put(ch[i], 1);
			}else {
				hmap.put(ch[i], hmap.get(ch[i])+1);
			}
		}
		
		hmap.forEach((K,V)->System.out.println(K+" : "+V));
	}

}
