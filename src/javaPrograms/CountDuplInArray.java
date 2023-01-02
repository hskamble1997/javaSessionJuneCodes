package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountDuplInArray {

	//inputarr[] = {1,1,2,4,3,3,1}
	//O/p	: 1 3
	
	public static void main(String[] args) {
		int arr[] = {1,1,10,10,10,2,4,5,6,99,99};
		
		Map<Integer, Integer> hmap = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!hmap.containsKey(arr[i])) {
				hmap.put(arr[i], 1);
			}else {
				hmap.put(arr[i], hmap.get(arr[i])+1);
			}
		}
		
		for(Integer e : hmap.keySet()) {
			if(hmap.get(e)>1) {
				System.out.println(e);
			}
		}

	}
	
	

}
