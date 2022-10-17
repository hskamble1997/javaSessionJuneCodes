package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AssignmentArrayyLIst {
	/*1. Write a Java program to create a new array list,
	  add some colors (string) and print out the collection
	*/
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Blue");
		ar.add("Red");
		ar.add("Green");
		ar.add("Orange");
		ar.add("Black");
		
		for(String e : ar) {
			System.out.println(e);
		}
		System.out.println("--------------");
		
		/* 2. Write a Java program to insert
		   an element into the array list at the first and last positions.
		*/
		ar.add(0, "Silver");
		ar.add(ar.size(), "Golden");
		
		
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("-------------");
		
		/* 3. Write a Java program to retrieve an element
       * (at a specified index) from a given array list.
        */
		
		System.out.println(ar.get(6));
		System.out.println(ar.get(4));
		
		System.out.println("--------------------");
		/* 4. Write a Java program to update specific array element by given element.
		* 
		*/
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("white");
		ar1.add("black");
		ar1.add("grey");
		ar1.add("pink");
		
		for(String e : ar1) {
			System.out.println(e);
		}
		
		System.out.println("------------");
		
		ar1.set(0, "Red");
		ar1.set(3, "orange");
		
		for(String e : ar1) {
			System.out.println(e);
		}
		System.out.println("--------------");
		
		/* 5. Write a Java program to remove the third  element from a array list. 
		* 
		*/
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		
		ar2.add(100);
		ar2.add(200);
		ar2.add(300);
		ar2.add(400);
		
		for(int j = 0; j<ar2.size(); j++) {
			System.out.println(ar2.get(j));
		}
		System.out.println("--------------");
		
		ar2.remove(2);
		
		for(Integer e : ar2) {
			System.out.println(e);
		}
		
		System.out.println("--------------");
		
		/* 6. Write a Java program to search an element in a array list.
		* 
		*/
		
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("harshal");
		ar3.add("neha");
		ar3.add("niku");
		ar3.add("Anuj");
		ar3.add("Rock");
		
		boolean isPresent = ar3.contains("niku");
		
		if(isPresent) {
			System.out.println("Element is present");
		}else {
			System.out.println("Element is not present");
		}
		System.out.println("------------------------");
		
		/**
		7. Write a Java program to reverse elements in a array list


		*/
		
		ArrayList<String> ar4 = new ArrayList<String>();
		
		ar4.add("Monday");
		ar4.add("Tuesday");
		ar4.add("Wednesday");
		ar4.add("Thusday");
		ar4.add("Friday");
		
		for(int l=ar4.size()-1; l>=0; l--) {
			System.out.println(ar4.get(l));
		}
		
//		Collections.reverse(ar4);
//		System.out.println(ar4);
		
		System.out.println("------------");
		/* 8. Write a Java program to extract a portion of a array list.
		                 *         
		                 */
		List<String> al = ar4.subList(0,3);
		System.out.println(al);
		
		String players[] = {"Virat","Ishan","Rohit","DK","Chahal"};
		
		List<String> list1 = Arrays.asList(players);
		for(int m=2;m<players.length;m++) {
			System.out.println(players[m]);
		}
		
		/*9. Write a Java program of swap two elements in an array list*/
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("IND");
		ar5.add("AUS");
		ar5.add("PAK");
		ar5.add("WI");
		
		System.out.println("Before swapping list : "+ar5);
		Collections.swap(ar5, 0, 1);
		System.out.println("After swapping list : "+ar5);
		
		System.out.println("==================");
		/* 10. Write a Java program to empty an array list.
		                 * 
		                 */
		ArrayList<Integer> ar6 = new ArrayList<Integer>();
		ar6.add(10);
		ar6.add(20);
		ar6.add(13);
		ar6.add(9);
		
		System.out.println("Original list : "+ar6);
		
		ar6.removeAll(ar6);
		System.out.println(ar6);
		
		System.out.println("-------------------");
		
		/* 11. Write a Java program to trim the virtual capacity of an
		 *  array list the current list size.
		 * 
		 * 
		 */
		
		ArrayList<Character> ar7 = new ArrayList<Character>();
		ar7.add('a');
		ar7.add('b');
		ar7.add('c');
		
		ar7.trimToSize();
		System.out.println(ar7);
		
		System.out.println("------------------");
		
		/* 12. Write a Java program to print all the elements of a
		   ArrayList using the position of the elements
		  */
		
		ArrayList<Integer> ar8 = new ArrayList<Integer>();
		ar8.add(100);
		ar8.add(200);
		ar8.add(300);
		ar8.add(400);
		
		for(int r=0;r<ar8.size();r++) {
			System.out.println(r+" : "+ar8.get(r));			
		}
		
		
	}
	
	
}
