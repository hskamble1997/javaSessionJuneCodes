package javaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String str = "reno";
		
		Map<Character,Integer> lmap = new LinkedHashMap<Character,Integer>();
		
		for(int i=0; i<str.length(); i++) {
			if(!lmap.containsKey(str.charAt(i))) {
				lmap.put(str.charAt(i), 1);
			}else {
				lmap.put(str.charAt(i), lmap.get(str.charAt(i))+1);
			}
		}

		for(Entry<Character, Integer> entry: lmap.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}
