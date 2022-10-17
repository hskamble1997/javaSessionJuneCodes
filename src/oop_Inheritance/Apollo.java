package oop_Inheritance;

public class Apollo extends Hospital{

	@Override
	public void m1() {
		System.out.println("m1 Apollo method");
	}
	
	@Override
	public void m2() {
		System.out.println("m2 Apollo method");
	}
	
	public void checkup() {
		System.out.println("Apollo check up method");
	}
}
