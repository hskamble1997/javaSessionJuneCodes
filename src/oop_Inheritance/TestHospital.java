package oop_Inheritance;

public class TestHospital {

	public static void main(String[] args) {

		Hospital h1 = new Hospital();
		h1.m1();
		
		Apollo a1 = new Apollo();
		a1.m1();
		a1.checkup();
		a1.m3();
		
		System.out.println("-------------------");
		
		//upcasting in this indvidi=ual method will hide bcz it fails class type check
		//and inherited methods and overriden method will be displayed 
		Hospital h2 =new Apollo();
		h2.m1();
		h2.m3();
		
		//downcasting
		Apollo a2 = (Apollo)new Hospital(); 
		a2.m1();
	}

}
