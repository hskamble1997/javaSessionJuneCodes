package javasessions;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		
		System.out.println(ar.get(0));
		
		System.out.println("------------------");
		
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i)); 
		}
		
		System.out.println("-------------------");
		
		
		for(int j=ar.size()-1;j>=0;j--) {
			System.out.println(ar.get(j)); 
		}

	}

}
