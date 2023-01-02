package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciUsingList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,1));
		
		while(list.size()<20) {
			Integer previous = list.get(list.size()-1);
			Integer previous1 = list.get(list.size()-2);
			list.add(previous+previous1);
		}
		
		list.forEach(k->System.out.println(k));

	}

}
