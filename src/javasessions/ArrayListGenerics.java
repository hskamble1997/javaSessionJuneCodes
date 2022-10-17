package javasessions;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		//ArrayList with Generics : 
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		marksList.add(100);
		marksList.add(200);
		
		for(Integer e : marksList) {
			System.out.println(e);
		}

		ArrayList<Double> bmiList = new ArrayList<Double>();
		
		bmiList.add(12.33);
		bmiList.add(100.00);
		
		ArrayList<String> empNamesList = new ArrayList<String>();
		empNamesList.add("Vinay");//0
		empNamesList.add("Lokesh");//1
		empNamesList.add("Archana");//2
		empNamesList.add("100");//3
		
		System.out.println(empNamesList.size());//4
		
		//for index:
		for(int i=0;i<empNamesList.size();i++) {
			System.out.println(empNamesList.get(i));
		}
		
		//for each
		for(String e : empNamesList) {
			System.out.println(e);
		}
		
		System.out.println("--------------");
		//AC:
		//Design a list of employee data
		//name(String),age(Int),salary(double),isPerm(boolean),gender(char)
		
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Harsh");
		empData.add(25);
		empData.add(12.33);
		empData.add(true);
		empData.add('f');
		
		for(Object e : empData) {
			System.out.println(e);
				if(e.equals(true)) {
					System.out.println("Grade A");
				}
		}
		
		
		
		
		
		
		
		
	}

}
