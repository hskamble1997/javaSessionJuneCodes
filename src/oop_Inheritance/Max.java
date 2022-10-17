package oop_Inheritance;

public class Max extends Hospital{

	@Override
	public void m1() {
		System.out.println("m1 Max method");
	}
	
	@Override
	public void m2() {
		System.out.println("m2 Max method");
	}
	
	public void checkup() {
		System.out.println("Max check up method");
	}
}
