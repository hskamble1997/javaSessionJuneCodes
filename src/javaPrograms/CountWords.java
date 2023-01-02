package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

	public static void main(String[] args) {

		String stmt = "Hi I am learning learning java python python";
		
		String[] words = stmt.split(" ");
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		for(String str : words)
		{
			if(!hmap.containsKey(str)) {
				hmap.put(str, 1);
			}else {
				hmap.put(str, hmap.get(str)+1);
			}
		}
		
//		for(String s : hmap.keySet()) {
//			if(hmap.get(s)>1)
//				System.out.println(s+" : "+ hmap.get(s));
//		}
		
		hmap.forEach((K,V) -> System.out.println(K +" : "+V));
		
	}
	
	
}
