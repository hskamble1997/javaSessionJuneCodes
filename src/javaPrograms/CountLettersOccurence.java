package javaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountLettersOccurence {

	public static void main(String[] args) {

		String word = "haloohhhh";
		
		char[] ch = word.toCharArray();
		
		Map<Character, Integer> hmap = new LinkedHashMap<>();
		
		for(int i = 0; i<ch.length; i++) {
			if(!hmap.containsKey(ch[i])) {
				hmap.put(ch[i], 1);
			}else {
				hmap.put(ch[i],hmap.get(ch[i])+1);
			}
		}
		
		//printing hashmap using forEach loop
		hmap.forEach((k,v) -> System.out.println(k+" : "+v));
	
		/*
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		for(Map.Entry<Character, Integer> e : hmap.entrySet()) {
			if(e.getValue()>1) {
				System.out.println("Key : "+ e.getKey()+" - Value : "+e.getValue());
			}
		}
		*/
		
	}

}
