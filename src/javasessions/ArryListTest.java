package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArryListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(1);
		ar.add(20);
		ar.add(19);
		
		Collections.sort(ar);
		System.out.println("Min value is : "+ar.get(0));
		System.out.println("Max value is :"+ar.get(ar.size()-1) );
		
//		
//		int arr[] = {1,2,3,4,11};
//		//System.out.println(arr);
//		System.out.println(Arrays.toString(arr));
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(2);
		ar1.add(13);
		ar1.add(220);
		ar1.add(119);
		System.out.println(ar1);
		
		ar1.addAll(ar);
		System.out.println(ar1);
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Tom");
		names.add("Peter");
		names.add("Lisa");
		names.add("Ravi");
		
		Collections.sort(names,Collections.reverseOrder());
		System.out.println(names);
		
		//Collections.sort(names);
		//System.out.println(names);
		
		
//		Collections.sort(ar1);
//		System.out.println(ar1);
//		
//		Collections.sort(ar1, Collections.reverseOrder());
//		System.out.println(ar1);
//		
		
		Collections.swap(names, 0, 3);
		System.out.println(names);
		
		Collections.swap(names, 1, 2);
		System.out.println(names);
		
		ArrayList<String> emp = new ArrayList<String>();
		emp.add("Tom");//0
		emp.add("Peter");//1
		emp.add("Lisa");//2
		emp.add("Ravi");//3
		emp.add("Mohit");//4
		
		System.out.println(emp);
		
		//emp.clear();
		//System.out.println(emp);
		
		if(emp.contains("Peter")) {
			System.out.println("Peter is present");
		}
		
		
		
		
		
	}

}
