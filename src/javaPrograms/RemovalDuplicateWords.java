package javaPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovalDuplicateWords {

	//input: I am am Rahul Rahul
	//Ouput : I am Rahul
	
	public static void main(String[] args) {
		String input = "I am am Rahul Rahul";
		String inputarr[] = input.split(" ");
		
		Set<String> lSet = new LinkedHashSet<>();
		
		for(String word : inputarr) {
			lSet.add(word);
		}
		
		Iterator<String> it = lSet.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
		
	}

}
