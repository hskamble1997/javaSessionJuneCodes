package oop_Inheritance;

public class Fortis extends Hospital{

	@Override
	public void m1() {
		System.out.println("m1 Fortis method");
	}
	
	@Override
	public void m2() {
		System.out.println("m2 Fortis method");
	}
	
	public void checkup() {
		System.out.println("Fortis check up method");
	}
}
